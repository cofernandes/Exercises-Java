
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex008 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("How much do you earn per hour: ");
       float a = scan.nextFloat();
       
       System.out.println("How many hours do you work: ");
       

       float b = scan.nextFloat();
       float c = (a * b);
       
       System.out.println("Your salary is going to be £ " + c);
    }
    
}
