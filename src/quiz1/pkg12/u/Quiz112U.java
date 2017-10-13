/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1.pkg12.u;

/**
 *
 * @author nate
 */
public class Quiz112U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     reverseString("!tseb eht si nahtaN"); 
        
        System.out.println("");
    }
    
    
    static String reverseString(String word){
      //get the last letter
       char lastLetter = word.charAt(word.length()-1);
//       make a new word
       String newWord = word.substring(0, word.length()-1);
       //print out the lastletter
            System.out.print(lastLetter);
            //when it is the last letter in the word retrn the last letter
        if (word.length() == 1 ) {
            return word;
        }
        //run the new word back in the meathod
        return reverseString(newWord);
    } 
}
