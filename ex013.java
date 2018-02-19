
package Exercises;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ex013 {

  
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       
       System.out.println("how much do you earn per hour £ ");
       float a = scan.nextFloat();
       
       System.out.println("how many hours did you work this month? ");
       float b = scan.nextFloat();
       
       float s = (a * b);
       
       float ir = (s * 11)/ 100;
       float inss = (s * 8)/ 100;
       float sind = (s * 5)/ 100;
       float sl = (s - ir - inss - sind);
       
       System.out.println("The gross salary £ "+ s);
       System.out.println("The total of IR paid £ " + ir);
       System.out.println("Total of INSS paid £ " + inss);
       System.out.println("The total of Syndicate £ " + sind);
       System.out.println("The net salary is £" + sl);
       
    }
    
}
