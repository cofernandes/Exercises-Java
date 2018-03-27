package Exercises;
//list 03 exercise 18

import java.util.Scanner;
public class ex046 {

  
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please type an integer number.");
    int num = scan.nextInt();
    
    boolean prime = true;
   
    for(int i=2; i<num; i++){
     if((num % i) ==1){
        System.out.println("Isn`t an interger number");
        prime = false;
    }
        
    }
    if(prime){
        System.out.println("Is an integer");
    }
    
}
}
