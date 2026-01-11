// check whether the number is prime or not 
// n = sqrt(n) * sqrt(n) 
// Math.sqrt(num) --> from java.util library

import java.util.*;
public class Question8 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // if imput is 1
        if(num == 1){
            System.out.println("1 is not prime nor composite");
        }
        // if input is 2
        else if(num == 2){
            System.out.println("2 is  prime number");
        }
        // other inputs
        else{
            for(int i = 2 ; i <= Math.sqrt(num) ; i++){
                if(num%i == 0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("The " + num + " is Prime number ");
            }else{
                System.out.println("The " + num + " is not Prime number");
            }
        }
        
    }
}
