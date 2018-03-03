
package Exercises;
//List 2 exercise 18
import java.util.Scanner;
public class ex029 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Checking if a number is odd or even");
       System.out.println("Enter with a number");
       int number = scan.nextInt();
       
       if (number % 2 == 0){
           System.out.println("This number is EVEN");
       }else{
           System.out.println("This number is ODD");
       } 
           
    }
    
}
