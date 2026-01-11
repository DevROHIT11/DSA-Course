/* Make a calculator using switch statement which will perform + - * / % operation */

import java.util.*;
public class Question1 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        double num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        double num2 = sc.nextInt();

        System.out.print("Enter the operator for operation = ");
        // next() takes input as a string but we want character so we takes the char at 0th index from the given string from user
        char op = sc.next().charAt(0);
        
        switch(op){

            case '+' : System.out.println( num1 + num2 );
                break;
            
            case '-' : System.out.println(num1 - num2);
                break;

            case '*' : System.out.println(num1 * num2);
                break;

            case '/' : System.out.println(num1 / num2);
                break;
            
            case '%' : System.out.println(num1 % num2);
                break;
            
            default : System.out.println("Invalid operator");
        }

    }
}
