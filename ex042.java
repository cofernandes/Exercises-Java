
package Exercises;
//list 03 exercise 10
import java.util.Scanner;
public class ex042 {

  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter with a interger number: ");
        int a = scan.nextInt();
        
        System.out.println("Please enter with other number:  ");
        int b = scan.nextInt();
        
         int count = a+1;
        for( ; count < b; ){
            System.out.println("The interval is: " + count);
            count += 1;
        }
    }
    
}
