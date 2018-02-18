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
public class ex007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter with the base:");
        System.out.println("Enter with the hight");
        
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        
        float c = (a * b)*2;
        
        System.out.println("The double of the square is: "+ c);
        
    }
    
}
