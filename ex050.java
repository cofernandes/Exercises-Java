
package Exercises;
//list 03 exercise 22

import java.util.Scanner;

public class ex050 {

  
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     int cd;
     float price;
     float sum = 0;
     
     System.out.println("what is the number of CD`s?");
     cd = scan.nextInt();
     
     for(int i=0; i<=cd; i++){
       System.out.println("What was the price for each CD");
       price = scan.nextFloat();
       
       sum +=price;
       
       System.out.println("The total of CD`s are:" + cd);
       System.out.println("The total price of your colection is £"+ sum);
     }
     
    }
    
}
