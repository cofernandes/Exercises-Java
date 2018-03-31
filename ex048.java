
package Exercises;
//list 03 exercise 20

import java.util.Scanner;

public class ex048 {

    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int people;
    int avarage;
    int age;
    
    System.out.println("Enter with a number of people");
    people = scan.nextInt();
    
    for(int i=0; i<people; i++){
        System.out.println("Type the age of people " + (i+1));
        age = scan.nextInt();
        
        age += people;
        
        avarage = age / people;
        
        if(avarage <25){
            System.out.println(" This group is Younger");
        }else if (avarage ==26 && avarage <60){
            System.out.println("This group is adult");
        }else{
            System.out.println("They are Elderly");
        }
        
    }
    
    
    
    
    }
    
}
