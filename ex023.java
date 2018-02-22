
package Exercises;
//List 2 exercise 11

import java.util.Scanner;

public class ex023 {

     public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("how much is your salary £ ?");
       float a = scan.nextFloat();
       
               
       if(a <= 280){
           System.out.println("Your increase will be the 20%");
           System.out.println("Your salary increase will be £ " + (a * 0.20)+ "your new salary will be £ " + (a *0.20+a));
          
       }else if (a > 280 && a <= 700){
           System.out.println("Your increase will be the 15%");
           System.out.println("Your salary increase will be £ " + (a * 0.15) + "Your new salary will be £ " + (a * 0.15+a));
       }else if (a > 700 && a <=1500){
           System.out.println("Yourincrease will be the 10%");
           System.out.println("Your salary increase will be £ " + (a * 0.10) + "Your new salary will be £ " +(a * 0.10 +a));
       }else if (a > 1500){
           System.out.println("Your salary increase will be the 5%");
           System.out.println("Your salary increase will be £ " + (a * 0.05) + "your new salary will be £ " +(a*0.05+a));
       }
    }
    
}
