// product of two numbers 

public class Function_2 {
    
    public static int product(int a , int b){
        return a*b;
    }

    public static void main(String[] args){
        
        int num1 = 10;
        int num2 = 20;
        int result = product(num1, num2) ;
        System.out.println("The product is  = " + result);

        result = product(  5 , 6) ;
        System.out.println("The product is  = " + result);

    }
}
