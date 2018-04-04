
package Exercises;
//List 03 exercise 25

import java.util.Scanner;

public class ex053 {


    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     //System.out.println("Tabajara`s Store");
     
     boolean exit = false;
     String keepBuying;
     int product;
     double price;
     double total;
     String output;
     double paid, change;
     
     do{
            System.out.println("Would you like to inform the new purchase? [y] or [n]");
            keepBuying = scan.next();
            if(keepBuying.equalsIgnoreCase("s")){

                output = "Tabaja`s Store\n";

              System.out.println("Type the quantity of product");  
              product = scan.nextInt();

              total =0;

               for(int i=1; i<=product; i++){
                   System.out.println("Type the price of products £" + i);
                   price = scan.nextDouble();
                   total += price;
                   output += "Product " + i + ": £ " + price + "\n";
               }

              output += "Total: £  " + total;
              System.out.println("total: £ " + total);

              System.out.println("Type the amount paid");
              paid = scan.nextDouble();

              output += "Money: £ " + paid + "\n";

              change = total - paid;

              output += "Change: £ " + change;

              System.out.println(output);

            }else{
                exit = true;
            }
         }while(!exit);
    }
}
     
