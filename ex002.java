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
public class ex002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please type a number");
        
        int number = scan.nextInt();
        
        System.out.println("The number typed was: " + number);
    }
    
}
