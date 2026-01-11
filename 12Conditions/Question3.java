/* 
income tax calculator
income < 5L 
tax 0%

income between 5L -10L
tax 20%

income above 10L
tax 30%
*/  

import java.util.*;

public class Question3 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);

        int income , tax_amount;
        System.out.print("Enter your income amount in Rs = ");
        income = sc.nextInt();

        // formula to calculate tax amount 
        if(income <= 500000){
            tax_amount = (0 * income )/100;
            System.out.println("You have to pay " + tax_amount + "rs as a tax");
        }
        else if(income > 500000 && income <=1000000){
            tax_amount = (20 * income )/100;
            System.out.println("You have to pay " + tax_amount + "rs as a tax");
        }
        else{
            tax_amount = (30*income) / 100;
            System.out.println("You have to pay " + tax_amount + "rs as a tax");
        }

        System.out.println();
    }
}
