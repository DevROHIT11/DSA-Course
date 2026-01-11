// print number from 1 to n , n will be given by user 

import java.util.*;
public class Question1 {
    public static void main(String[]  args ){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a the number till you want to print the numbers = ");
        int input = sc.nextInt();

        // variable to print number till user input value 
        int count = 1;
        while (count <= input) {
            System.out.println(count);  
            count ++;
        }
        
    
    }
}
