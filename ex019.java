
package Exercises;
// list number 2 exercise 6

import java.util.Scanner;


public class ex019 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter with the first number?");
       int a = scan.nextInt();
       
       System.out.println("Enter with second number?");
       int b = scan.nextInt();
       
       System.out.println("Enter with the third number");
       int c = scan.nextInt();
       
       if(a > b && a > c){
           System.out.println("The biggest number is" + a);
       }else if (b > a && b > c){
           System.out.println("The biggest number is" + b );
       }else if (a == b && a == c) {
           System.out.println("There is no biggest number all iquals");
           
       }else{
           System.out.println("The biggest number is" + c);
       }
    }
    
}
