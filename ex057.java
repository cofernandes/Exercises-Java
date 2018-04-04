
package Exercises;
//list 03 exercise 29

import java.util.Scanner;

public class ex057 {

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter with a interger number");
        int number = scan.nextInt();
        
     
        
        System.out.println("-------------------------------------------------");
        
        for(int i=1; i<=number; i++){
            boolean prime = true;
               
            for(int j=2; j<i; j++)   
            if(i % j == 0){
             //System.out.println(i);
             prime = false;
            }
           
             if (prime){
            System.out.println(i);
        }
        }

    }
    
}
