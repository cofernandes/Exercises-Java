
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex014 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Type a number");
       int a = scan.nextInt();
       
       System.out.println("Type a second number");
       int b = scan.nextInt();
       
       if(a > b){
           System.out.println("The biggest number typed is " + a);
       }else System.out.println("The biggest number is: " + b);
    }
    
}
