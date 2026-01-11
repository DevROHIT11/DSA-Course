// Question --> convert decimal to binary 
// divided the given number by 2 and the remainder will the binary number at end just reverse the remainder 

public class Question_4 {

    public static void decToBin(int num) {
        int rem = 0;
        int pow = 0;
        int final_num = 0;

        //loop 
        while (num > 0) {
            rem = num % 2;
            num = num / 2;

            // to write the number in reverse form
            //  units = 10 pow 0
            // tenth = 10 pow 1
            // hundredth = 10 pow 2

            final_num = final_num + (rem * (int)Math.pow(10, pow));
            pow ++ ;
        }
         System.out.print(final_num);
    }

    public static void main(String[] args) {
        decToBin(5);
    }
}
