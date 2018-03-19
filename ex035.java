
package Exercises;
//List 03 exercise 04

public class ex035 {

    
    public static void main(String[] args) {
        
        int pop1 = 80000;
        int pop2 = 200000;
        int count = 0;
        
        while(pop1 <= pop2){
            
            pop1 += (pop1/100)*3;
            pop2 += (pop2/100)*1.5;
            count++;
        }
        
        System.out.println("It is going to take about " + count);
    }
    
}
