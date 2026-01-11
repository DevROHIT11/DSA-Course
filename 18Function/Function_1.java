import java.util.*;


public class Function_1 {

    // function / Method
    public static void Hello_World(){
        System.out.println("Hello World");
    }

    // parametrized function
    public static int Sum(int a , int b){   //parameters or formal parameters
        int sum = a + b ;
        return sum;
    }

    public static void main(String[]  args ){
        Hello_World();

        // parametrized function parameters 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int a = sc.nextInt();
        System.out.print("Enter num2 = ");
        int b = sc.nextInt();
        //storing value of parametrized 
        int result = Sum(a , b);  //arguments or actual parameters
        System.out.println("the Sum is = " + result);
        
    }
}
