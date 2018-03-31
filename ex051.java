
package Exercises;
//List 03 exercise 23

import java.util.Scanner;

public class ex051 {

   
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
        

    System.out.println("Welcome to the Store");
    System.out.println("Table of price");
    
    for(int i=1; i<=50; i++){
                
        System.out.println(i +" = "+ " £ " + 1.99* i);
    }
    }
    
}
