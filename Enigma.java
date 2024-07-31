
public class Enigma{
   private Rotor inner_rotor; //change to inner
   private Rotor mid_rotor; //change to mid
   private Rotor outer_rotor; //change to outer
   private char  starting_char;

   //private String [] choices_ofRotors = new String [5]; 
   private String [] choices_ofRotors = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
                                         "#EJOTYCHMRWAFKPUZDINSXBGLQV",                      
                                         "#BDFHJLNPRTVXZACEGIKMOQSUWY",
                                         "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
                                         "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    public Enigma (int inner, int mid, int outer, String str ){
       this.inner_rotor = new Rotor (this.choices_ofRotors[inner-1], str.charAt(0));
       this.mid_rotor = new Rotor (this.choices_ofRotors[mid-1], str.charAt(1));
       this.outer_rotor = new Rotor (this.choices_ofRotors[outer-1], str.charAt(2));
       this.starting_char = str.charAt(0);
    }
   public String encrypt(String str){
      char [] encrypted_final = new char [str.length()];
    for(int i =0; i < str.length(); i++){
      //This takes the index of the message and finds it in the inner rotor
      char cur_char = str.charAt(i);
      int indexof_cur = inner_rotor.getIndex(cur_char); //gets index of current char in inner rotor
      //char charOf_cur_in_inner = inner_rotor.getChar(indexof_cur);  //gets char of current char in inner rotor //unecessary? 
      //Find corresponding char in outer rotor 
      char outerOne = outer_rotor.getChar(indexof_cur);
      //Find index of above char in mid rotor
      int index2 = mid_rotor.getIndex(outerOne);
      char output_letter = outer_rotor.getChar(index2);  
      encrypted_final[i] = output_letter; 
      inner_rotor.rotateOnceClockwise();
      if(inner_rotor.getChar(0) == starting_char){
         mid_rotor.rotateOnceClockwise();
      }
    }
    return String.valueOf(encrypted_final);    
   } 
   
   public String decrypt (String str) {
      char [] decrypted_final = new char [str.length()];
      for(int i =0; i < str.length(); i++){
         char cur_char = str.charAt(i);
         int indexof_cur = outer_rotor.getIndex(cur_char);
         //char charOf_cur_in_outer = outer_rotor.getChar(indexof_cur);
         char midOne = mid_rotor.getChar(indexof_cur);
         int index2 = outer_rotor.getIndex(midOne);
         char output_letter = inner_rotor.getChar(index2);
         decrypted_final[i] = output_letter;
         inner_rotor.rotateOnceClockwise();
         if(inner_rotor.getChar(0) == starting_char){
            mid_rotor.rotateOnceClockwise();
         }
      }
      return String.valueOf(decrypted_final);
   }


}



   


    


