// Sum of first n natural numbers 

import java.util.*;
public class Question2 {
    public static void main(String[]  args ){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the range = ");
        int range = sc.nextInt();

        int count = 1;
        int sum = 0;

        while(count <= range ){
           sum += count;
           count++ ;
            
        }
        System.out.println(sum);
    }
    
}
