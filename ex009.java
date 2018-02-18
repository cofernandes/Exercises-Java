
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      
      System.out.println("Whta`s is the temperature in fahrenheit:");
      
      float f = scan.nextFloat();
      float c = (5 * (f - 32))/9;
      
      System.out.println("The temperature in Celsius is C: "+ c);
      
      
    }
    
}
