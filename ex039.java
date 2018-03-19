
package Exercises;
//list 03 exercise 07
import java.util.Scanner;
public class ex039 {

  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
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
      
      if(a > b && a>b && a>c && a>d && a>e){
          System.out.println("The bigger one is A: " + a);
      }else if (b>a && b>c && b>d && b>e){
          System.out.println("The biggest is B: " + b);
      }else if(c>a && c>b && c>d && c>e){
          System.out.println("The biggest number is C: " + c);
      }else if(d>a && d>b && d>c && d>e){
          System.out.println("The biggest number is D: " + d);
      }else if(e>a && e>b && e>c && e>d){
          System.out.println("The biggest number is E: " + e);
      }else{
          System.out.println("There is no biggest number between the 5");
      }
    }
    
}
