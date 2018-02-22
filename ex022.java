
package Exercises;
// list 2 exercise 10

import java.util.Scanner;

public class ex022 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What period do you study m (morning) a (afternoon) e (evening)?");
        String a = scan.nextLine();
        
        switch(a){
            case "m": System.out.println("Good Morning");break;
            case "a": System.out.println("Good afternoon");break;
            case "e": System.out.println("Good evening");break;
            default: System.out.println("Sorry this is not valid period");
        }
    }
    
}
