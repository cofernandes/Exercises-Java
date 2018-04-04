

package Exercises;
//list 03 excise17

import java.util.Scanner;

public class ex054 {
    
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int number;
        int resultado=0;
        
         System.out.println("Please enter with a number to be factored");  
         number = scan.nextInt();
         System.out.println("");

         for(int i= number; i>1; i--){
             number = number *(i-1);
                         
             System.out.println(number);
         }
    
        
    }
      
}
