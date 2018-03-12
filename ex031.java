
package Exercises;
//List 02 exercise 21

import java.util.Scanner;
public class ex031 {

   
    public static void main(String[] args) {
        
        float value = 0;
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Which combustive do you wanna [1]= gasoline or [2]= alchool ?");
       int fuel = scan.nextInt();
       
       System.out.println("How many liters do you want ?");
       float liter = scan.nextFloat();
       
       if(fuel == 1){
          value = 2.50f * liter;
          
          if(liter <=20){
              System.out.println("You got a 4% descont new total £ " + (value -(value * 0.04)));
          }else if(liter > 20){
              System.out.println("You`ve got a 6% descount new total £ " + (value - (value * 0.06)));
          }
       }
       if(fuel == 2){
           value = 1.90f * liter;
           
          if(liter <=20){
              System.out.println("You have got a 3% descount new total £ " + (value -(value * 0.03)));
          }else if(liter >20){
              System.out.println("You have got a 5% descount new value £ " +(value -(value * 0.05)));
          } 
       }
    }
    
}
