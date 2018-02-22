
package Exercises;
//list 2 exercise 9

import java.util.Scanner;

public class ex021 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Type a number");
       int a = scan.nextInt();
       
       System.out.println("Type another number");
       int b = scan.nextInt();
       
       System.out.println("Type one more number");
       int c = scan.nextInt();
       
       if ( a > b && a > c && b < a && b < c){
           System.out.println("descending order is " + a + b + c);
       }else if (b > a && b > c && a > c){
           System.out.println("descending order" + a+b+c);
       }else if (c > a && c > b && a < b){
           System.out.println("descending order" + c+b+a);
       }
    }
    
}
