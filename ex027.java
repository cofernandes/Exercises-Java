 
package Exercises;
// List 02 exercise 15

import java.util.Scanner;
public class ex027 {

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Let`s make a triangle enter with 3 lines");
     System.out.println("Enter with straght line A");   
        float a = scan.nextFloat();
        
    System.out.println("Enter with straght line B");
        float b = scan.nextFloat();
        
    System.out.println("Enter with straght line C");
        float c = scan.nextFloat();
        
        if(a + b >c){
            System.out.println("there is a triangle");
        }else if (b + c > a){
            System.out.println("There is a triangle");
        }else if (c + a > b){
            System.out.println("There is a triangle");
        }else {
          System.out.println("Sorry we do not have a triangle try again");
        }
            
    }
    
}
