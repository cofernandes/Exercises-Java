
package Exercises;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ex012 {

 
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("Enter with your height");
       float a = scan.nextFloat();
       
       System.out.println("Enter with your witght");
       float b = scan.nextFloat();
       
       float c = (b * a)-58;
       
       System.out.println("Your ideal witght is: " + c);
       
    }
    
}
