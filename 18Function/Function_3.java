
import java.util.Scanner;

// factorial of given number 

public class Function_3 {

    // calculating factorial
    public static int factorial(int num){
        int fact  = 1;

        for(int i = 1 ; i <= num ; i++){
            fact  *= i;
        }
        System.out.println("The factorial of " + num + " is = " + fact);
        return 0 ;

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number = ");

        // taking input from user 
        int a = sc.nextInt();

        // calling factorial function
        factorial(a);
    }
    
}
