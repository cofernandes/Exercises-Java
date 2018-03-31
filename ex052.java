
package Exercises;
// List 03 exercise 24

import java.util.Scanner;

public class ex052 {

   
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    double bread;
    
    System.out.println("Welcome to the Fernandes Bakery");
    System.out.println("Please enter with the price of the bread");
    bread = scan.nextDouble();
    
    
    
    for(int i=1; i<=50; i++){
        System.out.println(i + " = " + " £ " + (i*bread));
    }
    }
    
}
