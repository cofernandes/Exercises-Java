
package Exercises;
//List 03 exercise 12
import java.util.Scanner;
public class ex043 {

   
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);  
     
     int total;
     System.out.println("Which table would you like?");
     int table = scan.nextInt();
     
     System.out.println("table of " + table);
     
     
     for(int i=0; i<= 10; i++){
         total = table * i;
         System.out.println(table + " x " + i + " = " + total);
     }
     
     
     
    
     
     
    }
    
}
