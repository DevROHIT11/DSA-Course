// print the number entered by the user except 10 
// In previous example we break the loop when their is multiple of 10 here we have to skip

import java.util.*;
public class Question7 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);
       
        do{
            System.out.print("Enter the number = ");
            int num  = sc.nextInt();
            if(num%10 == 0){
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
