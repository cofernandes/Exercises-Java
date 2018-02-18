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
public class ex005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("How much meters do you wanna convert to centemeters");
     
       float a = scan.nextFloat();
       float b = (a*100);
       
       System.out.println("The conversor is: " + b);
              
    }
    
}
