
package Exercises;
//linst 02 exercise 22

import java.util.Scanner;
public class ex032 {

    
    public static void main(String[] args) {
      Scanner  scan = new Scanner(System.in);
      
     System.out.println("Type how many kg of Strawberry would you like?");
      double kg = scan.nextDouble();
      
      System.out.println("Enter how many kg of  apples would you like?");
      double kga = scan.nextDouble();
      
      double priceStraw = 0;
      if(kg <= 5){
          priceStraw = 2.50;
      }else {
        priceStraw = 2.20;  
      }
      
      double priceApp = 0;
      if(kga <= 5){
          priceApp = 1.80;
      }else {
          priceApp = 1.50;
      }
      
      double totalPriceStraw = priceStraw * kg;
      double totalPriceApp = priceApp * kga;
      
      double finalPrice = totalPriceStraw + totalPriceApp;
      
     
     
      if(finalPrice > 25){
          double priceDesc = finalPrice -(finalPrice * 0.10);
          System.out.println("You have to pay £ " + priceDesc );
      }else{
          System.out.println("The total to pay is £ " + finalPrice );
      }
      
    }
    
}
