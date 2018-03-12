package Exercises;
//List 02 exercise 20
import java.util.Scanner;

public class ex030 {

    public static void main(String[] args) {
    Scanner scan = new  Scanner (System.in);    
    
    int answer = 0;
    
    System.out.println("Did you call to the victim?");
    System.out.println("[y] for yes [n]no");
    String a = scan.nextLine();
      if(a.equals("y") || a.equals("y")){
            answer++;
        }
    
    System.out.println("did you owe money to the victim?");
    System.out.println("[1] for yes [2]no");
    String b = scan.nextLine();
    if(b.equals("y") || b.equals("y")){
        answer++;
    }
    
    System.out.println("Have you been on the crime place?");
    System.out.println("[1] for yes [2]no");
    String c = scan.nextLine();
    if(c.equals("y") || c.equals("y")){
        answer++;        
    }
    
    System.out.println("Did you live close to the victim?");
    System.out.println("[1] for yes [2]no");
    String d = scan.nextLine();
    if(d.equals("y") || d.equals("y")){
        answer++;
    }
    
    System.out.println("have you worked with the victim?");
    System.out.println("[1] for yes [2]no");
    String e = scan.nextLine();
    if(e.equals("y") || e.equals("y")){
        answer++;
    }
    
   if(answer == 2){
       System.out.println("You are suspect on the crime");
   }else if(answer == 3 && answer <=4){
       System.out.println("You are cumplice on the crime");
   }else if(answer ==5){
       System.out.println("You are the kiler");
   }
        
    }
    
}
