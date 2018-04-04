
package Exercises;
//list 03 exercise 27

import java.util.Scanner;
public class ex055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double temp;
        int qtd=0;
        int sum =0;
        double smaller = Double.MAX_VALUE;
        double biggest = Double.MIN_VALUE;
        
        System.out.println("How many temperature are you going to enter?");
        qtd = scan.nextInt();
        
        System.out.println("-----------------------------------------");
        
        for(int i=1; i<=qtd; i++){
            System.out.println("Please enter with all the temperature" + i);
            temp = scan.nextDouble();
            
            sum += temp;
            
            if(temp > biggest){
                biggest = temp;
            }
            if(temp < smaller){
                smaller = temp;
            }
            System.out.println("The avarage of temperature is: " + (sum/qtd));
            System.out.println("The smaller number is:" + smaller);
            System.out.println("The biggest number is: " + biggest);
        }
    }
    
}
