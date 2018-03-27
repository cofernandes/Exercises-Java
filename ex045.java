
package Exercises;
//List 03 exercise 16

import java.util.Scanner;
public class ex045 {

   
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     int first = 1;
     int second = 1;
     int next;
     
     System.out.println("Enter with the n-essimo term of Fibonacci serie");
     int n = scan.nextInt();
     
     
     
     // 1,1,2,3,5,8,13,21,34,55
     
     for (int i=3; i<n; i++){
         
         next = first + second;
         first = second;
         second = next;
         
         System.out.println(next);
         
     }
    }
    
}
