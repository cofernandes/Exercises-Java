
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex015 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type a positive or negative number");
        int a = scan.nextInt();
        
        if (a < 0){
            System.out.println("Is a negative number: " + a);
        }else System.out.println("Is a positive number: " + a);
        
    }
    
}
