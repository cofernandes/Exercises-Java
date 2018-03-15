
package Exercises;
//List 03 exercise 01
import java.util.Scanner;
public class ex033 {

  
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     boolean validNumber = false;
     
     do{
         
          
     System.out.println("Please enter with a number between 0 and 10");
     int number = scan.nextInt();
     
     if(number >=0 && number <=10){
         validNumber = true;
         System.out.println("You typed the right number " + number);
     }else{
         System.out.println("Wrong number try again!");
        }
     }while (!validNumber);
        
     
     
    }
    
}
