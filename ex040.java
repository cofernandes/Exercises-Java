
package Exercises;
//list 3 exercise 8
import java.util.Scanner;
public class ex040 {

    public static void main(String[] args) {
     Scanner scan = new java.util.Scanner(System.in);
      
      System.out.println("Please enter with 5 numbers");
      System.out.println("First number: ");
      int a = scan.nextInt();
      
      System.out.println("Scond number: ");
      int b = scan.nextInt();
      
      System.out.println("Third number: ");
      int c = scan.nextInt();
      
      System.out.println("Fourth number: ");
      int d = scan.nextInt();
      
      System.out.println("fith number: ");
      int e = scan.nextInt();
      
      int sum =(a+b+c+d+e);
      int avarege = (a+b+c+d+e)/4;
      
      System.out.println("The sum of those number is: " + sum);
      System.out.println("The avarage of those numbers is: " + avarege);
    }
    
}
