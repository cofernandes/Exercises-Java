
package Exercises;
//list 2 exercise 8

import java.util.Scanner;

public class ex020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("enter the price product 1? ");
        float a = scan.nextFloat();
        
        System.out.println("Enter the price product 2? ");
        float b = scan.nextFloat();
        
        System.out.println("Enter the price product 3? ");
        float c = scan.nextFloat();
        
        if (a < b && a < c){
            System.out.println("You should buy the product number 1 £" + a);
        }else if (b < a && b < c){
            System.out.println("You should buy the product 2 £" + b);
        }else if (c < a && c < b){
            System.out.println("You should buy the produt 3 £" + c);
        }else if (a == b && a == c){
            System.out.println("Does`t matter all price the same");
        }
    }
    
}
