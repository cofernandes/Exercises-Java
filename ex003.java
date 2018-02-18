/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please type a number");
        System.out.println("Type the second number");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("The result is: " + c);
        
    }
    
}
