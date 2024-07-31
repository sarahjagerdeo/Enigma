public class Rotor{

    private String rotor_str; 

    //Workings of one rotor
    public Rotor(String str1, char charAt) {
       boolean end = true;
       this.rotor_str = str1;
       while(end){
         if(this.rotor_str.charAt(0) == charAt){
            break;
         } 
         rotateOnceClockwise();
       } 
    }

    public void rotateOnceClockwise(){
        //Copys the string
        //takes the last character in the string
        //puts it in the front
        char arr [] = new char [27];
        int last_index = arr.length-1;
        for(int i=0; i < last_index; i++ ){
            arr[i+1] = this.rotor_str.charAt(i);
        }
        arr[0] = this.rotor_str.charAt(last_index);
        this.rotor_str = String.valueOf(arr);

    }

    public int getIndex (char charAt){
        for(int i=0; i < this.rotor_str.length(); i++){
            if(this.rotor_str.charAt(i) == charAt){
              return i;
            }
        }
        return 0;
    }


    public char getChar (int index){
      return this.rotor_str.charAt(index);
    }

     
}
