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
public class ex004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Type your first grade:");
        System.out.println("Type your second grade:");
        System.out.println("Type your third grade:");
        System.out.println("Type your fourth grade:");
        
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        
        float sun = (a + b + c + d)/4;
        
        System.out.println("Your final grade is: " + sun);
        
    }
    
}
