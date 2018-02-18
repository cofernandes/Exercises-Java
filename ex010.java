
package Exercises;

import java.util.Scanner;

public class ex010 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("Enter with the temperature in Celsius C:");
       
       float c = scan.nextFloat();
       float f = (float) (c * 1.8 + 32);
       
       System.out.println("The temperature in  fahrenheit is F:" + f);
    }
    
}
