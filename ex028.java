
package Exercises;
//List 2 exercise 17

import java.util.Scanner;
public class ex028 {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Checking if is Leap Year");
       System.out.println("Please enter with a year");
       int year = scan.nextInt();
       
       if (year % 400 == 0 && year % 4 == 0 && year % 100 !=0){
           System.out.println("This year is a LEAP YEAR");
       }else {
           System.out.println("Is not a Leap year");
       }
       
    }
    
}
