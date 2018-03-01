package Exercises;
//List 2 exercise 12

import java.util.Scanner;


public class ex024 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("How much do you earn per month £ ");
       float a = scan.nextFloat();
       
       System.out.println("How many hours do you work? ");
       float b = scan.nextFloat();
       
       float salary = (a * b);
       
       // £900
       float c = (3 / 100)*salary;
       float d = (11 / 100)*salary;
       float e = (c+d);
       float f = (salary - e);
       
       // £1500
       float ir = (5 / 100)* salary;
       float g = (c + d + ir);
       float h = (salary - g);
       
       //2500
       float i = (10 / 100)* salary;
       float j = (c + d + i);
       float l = (salary - j);
       
       //>2500
       float m = (20 / 100)* salary;
       float n = (c + d + m);
       float o = (salary - n);
       
      if(salary <= 900){
          System.out.println("Gross salary £" + salary);
          System.out.println("Syndicate tax" + c);
          System.out.println("FGTS tax" + d);
          System.out.println("total of tax" + g);
          System.out.println("Payment" + f);
      }else if (salary <= 1500 && salary < 900){
          System.out.println("Gross salary £" + salary);
          System.out.println("Syndicate tax £" + c); 
          System.out.println("FGTS tax £" + d);
          System.out.println("IR tax £" + ir);
          System.out.println("total of tax £" + g); 
          System.out.println("Payment £" + h);        
    }else if (salary >=2500 && salary <1500){
          System.out.println("Gross salary £" + salary);
          System.out.println("Syndicate tax £" + c); 
          System.out.println("FGTS tax £" + d);
          System.out.println("IR tax £" + i);
          System.out.println("total of tax £" + j); 
          System.out.println("Payment £" + l);
    }else if (salary >2500){
          System.out.println("Gross salary £" + salary);
          System.out.println("Syndicate tax £" + c); 
          System.out.println("FGTS tax £" + d);
          System.out.println("IR tax £" + m);
          System.out.println("total of tax £" + n); 
          System.out.println("Payment £" + o);
    }
    
    }
    
}        
               