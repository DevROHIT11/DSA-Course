// FUNCTION OVERLOADING -->  same name function but having diff parameters
// note *** function overloading can be determined from parameters but not by function return type 
// float sum (int a , int b)
// int  sum (int a , int b)


public class Fucntion_overloading5 {
    
    // func for sum of 2 numbers
   public static int sum(int a , int b){
        return a + b;
    }

    // func for sum of 3 num 
    public static int sum (int a , int b  , int c ){
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(sum(2 , 3));

        System.out.println(sum(2 , 3 , 4));

    }
}
