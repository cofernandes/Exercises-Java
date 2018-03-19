package Exercises;
//List 03 exercise 05
import java.util.Scanner;
public class ex036 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int pop1;
        int pop2;
        float rate1;
        float rate2;
        
        boolean valid = false;
        
        do{
              System.out.println("Enter with a population 1");
        pop1 = scan.nextInt();
        if(pop1 >0){
            valid = true;
        }else{
            System.out.println("Population should be more than 0");
        }
            
        } while (! valid);
        
        valid = false;
        
        do{
              System.out.println("Enter with a population 2");
        pop2 = scan.nextInt();
        if(pop2 >0){
            valid = true;
        }else{
            System.out.println("Population should be more than 0");
        }
            
        } while (! valid);
        
         valid = false;
        
        do{
              System.out.println("Enter with a growth rate 1");
        rate1 = scan.nextFloat();
        if(rate1 >0){
            valid = true;
        }else{
            System.out.println("The rate growth should be more than 0");
        }
            
        } while (! valid);
        
           valid = false;
        
        do{
              System.out.println("Enter with a growth rate 2");
        rate2 = scan.nextFloat();
        if(rate2 >0){
            valid = true;
        }else{
            System.out.println("The rate growth should be more than 0");
        }
            
        } while (! valid);
        
                
        int count = 0;
        
        while(pop1 < pop2){
            
            pop1 += (pop1/100)*rate1;
            pop2 += (pop2/100)*rate2;
            count++;
        }
        System.out.println("Population 1 = " + pop1);
        System.out.println("Population 2 = " + pop2);
        System.out.println("It is going to take about " + count);
    }
    
}