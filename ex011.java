
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex011 {
     public static void main(String[] args){
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Enter with a interger number");
         int a = scan.nextInt();
         
         System.out.println("Enter with another interger number");
         int b = scan.nextInt();
         
         System.out.println("Enter with a real number");
         int c = scan.nextInt();
         
         a = (a * 2)+ b / 2;
         b = (c * 3)+ a;
         c = (c * c * c);
         
         System.out.println("The first result is:" + a);
         System.out.println("The second result is: " + b);
         System.out.println("The third result is: " + c);
     }
    
}
