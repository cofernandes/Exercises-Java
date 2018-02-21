
package Exercises;
//List number 02 exercise 05

import java.util.Scanner;

public class ex018 {

    public static void main(String[] args) {
        Scanner notes = new Scanner(System.in);
        
        System.out.println("Type your frist grade? ");
        float a = notes.nextFloat();
        
        System.out.println("Type your second grade? ");
        float b = notes.nextFloat();
        
        float c = (a + b)/2;
        
        if (c < 7){
            System.out.println("you`re reproved with " + c);
        }else if (c >= 7 && c <= 9){
            System.out.println("You`re aproved with " + c);
        }else if (c == 10){
            System.out.println("You`re aproved with distinction " + c);
    }
       
    }
    
}
