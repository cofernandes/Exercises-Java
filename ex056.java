
package Exercises;
//List 03 exercise 28

import java.util.Scanner;

public class ex056 {

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter with a interger number?");
        int number = scan.nextInt();
        
        boolean prime = true;
        
        for(int i =2; i<number; i++){
            if(number % i == 0){
               System.out.println(i  + " : Isn`t a primer number");
               prime = false;
            }
        }
        
        if(prime){
            System.out.println("primer number");
        }
        
    }
    
}
