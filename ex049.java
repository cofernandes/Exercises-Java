
package Exercises;
//list 03 exercise 21

import java.util.Scanner;

public class ex049 {

    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sum =0;
    int avarage;
    int college;
    int students;
    boolean invalid = true;
    
    System.out.println("What`s the number of class");
    college = scan.nextInt();
    
    for(int i=1; i<=college; i++){
        invalid =true;
        do{
        System.out.println("Enter with the number of students? " +i);
        students = scan.nextInt();
        
        if(students <= 40){
            invalid = false;
            
        }else{
            System.out.println("Number of students are invalid enter again");
        }
        }while (invalid);
        
        sum  += students;
        
        avarage = sum / college;
        
        System.out.println("The avarage students per class are:" + avarage);
        
    }
    
    
    }
    
}
