
package Exercises;
//List 03 exercise 31

import java.util.Scanner;

public class ex059 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please inform the salary £");
        float salary = scan.nextFloat();
        
        System.out.println("--------------------------------------------------");
        
        int year = 1996;
        double increase = 1.5;
        float total=0;
        
                
        total = (float) (salary + (increase / 100 *salary));
        
      
                
            for(int i=1997; i<=2018; i++){
               
              increase *= 2;
              
              total += (salary / 100 * increase);
              
                System.out.println(i + " £ " + total);
            
        }
            
        }
        
        
        
    }
    
