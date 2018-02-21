package Exercises;

import java.util.Scanner;

public class ex016 {

    public static void main(String[] args) {
      Scanner  scan = new Scanner(System.in);
     
      System.out.println("Type your gender F for (female) or M for (male)");
      String a = scan.nextLine();
      
      if (a.equals ("F")){
          System.out.println("Your gender is Female" + a);
      }else if (a.equals("M")){
          System.out.println("Your gender is Male " + a);
      }else {
           System.out.println("Is not a valid letter for gender");
      }
         
    }
    
}
