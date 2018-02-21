

package Exercises;
// List number 2 exercise 4

import java.util.Scanner;

public class ex017 {

    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        
        System.out.println("Type a letter");
        String le = letter.nextLine();
        
        switch(le){
            case "a": System.out.println("You typed a vowel"); break;
            case "e": System.out.println("You typed a vowel"); break;
            case "i": System.out.println("You typed a vowel"); break;
            case "o": System.out.println("You typed a vowel"); break;
            case "u": System.out.println("You typed a vowel"); break;
            default: System.out.println("You typed a consonant");
        }
    }
    
}
