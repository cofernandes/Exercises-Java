
package Exercises;
//list 03 exercise 30

import java.util.Scanner;

public class ex058 {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       int table;
       int start;
       int finish;
       int total;
       
       System.out.println("With table do you want?");
       table = scan.nextInt();
       
       System.out.println("Which number will start?");
       start = scan.nextInt();
       
       System.out.println("which number will finish?");
       finish = scan.nextInt();
       
       System.out.println("--------------------------------------------------");
       
       if(start > finish){
           int temp = finish;
           finish = start;
           start = temp;
       }
       for(int i=start; i<=finish; i++){
           total = table * i;
           System.out.println(table + " X " + i + " = " + total);
       }
       
    }
    
}
