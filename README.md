Enigma

## Describe your work

In this program the files that I completed were rotor.java and engima.java. In the rotor file it was the single workings for one rotor. For the enigma file it was where we were preforming the actual encryption.

## Rotor.java

In the rotor class you had a private variable that could only be acessed in that class. We also needed a constructor that would represent one rotor. In the contructor we could use the other methods we wrote in this class to be called in the contructor to represent the workings of a rotor.The rotate function is encapsulated in the rotor class because we only want to rotate a rotor only. There is no really reason that the enigma class needs the whole method to rotate only to call it.


## Enigma.java

In enignma I have four private variables which, three are made from the Rotor class. Those three private strings are the rotors and they will help us give the user the rotor they choose. I hard coded the strings into a private string variable because it belongs to the enigma class and does not really need to be used outside. The enigma constructor creates the machine therefore needs to choose the rotors. When you call the enigma constructor it can create the rotors needed that the user wanted. Otherwise then that the encrypt and decrypt method is in enigma because it has to work with the strings that are in that class.
