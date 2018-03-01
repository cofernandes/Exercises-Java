
package Exercises;
//list 2 exercise 14

import java.util.Scanner;

public class ex026 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in); 
       
       System.out.println("Please enter with first grade? ");
       float a = scan.nextFloat();
       
       System.out.println("Enter with your second grade? ");
       float b = scan.nextFloat();
       
       float c = (a + b)/2;
     
       if(c >=9 && c <10){
           System.out.println("Student with concept A, Aproved " + c);
       }else if (c >=7.5 && c <9){
           System.out.println("Student with concept B, Aproved " + c);
           
       }else if (c >= 6 && c <7.5){
           System.out.println("Student with concept C, Aproved " + c);
           
       }else if (c >=4.0 && c <6){
           System.out.println("Student with concept D, Reproved " + c);
           
       }else if (c >=0 && c<4){
           System.out.println("System.out.println E, Reproved " + c);
       }
       
    }
    
}
