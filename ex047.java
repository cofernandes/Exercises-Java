
package Exercises;
//list 03 exercise 18
import java.util.Scanner;

public class ex047 {

 
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       double grade;
       double avarage;
       double sum = 0;
       
       System.out.println("Please enter with numbers of grade");
        grade = scan.nextDouble();
       
       for(int i=0; i<grade; i++){
           System.out.println("Type a grade" + (i+1));
           grade = scan.nextDouble();
           
           sum += grade;
           avarage = sum / grade;
           
           System.out.println("The sum is: " + sum);
           System.out.println("The grade is: " + avarage);
    }
       
       
    }
    
}
