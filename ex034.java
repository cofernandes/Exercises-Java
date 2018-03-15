
package Exercises;
//List 03 exercise 02

import java.util.Scanner;

public class ex034 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean test = false;
        do{
              System.out.println("Please enter with your name");
        String name = scan.nextLine();
        
        System.out.println("Please enter with your password");
        String password = scan.nextLine();
        
        if(name.equals(password)){
            System.out.println("Password and name are the same please change ");
                        
        }else{
            test = true;
            System.out.println("You're logged in");
        }
            
        }while(!test);
        
     
    }
    
}
