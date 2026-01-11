
public class Question4 {
    public static void main(String[]  args ){
        int num = 1099;
        int counter = 0;

        while(num > counter){
            // to get last digit of number
            int lastDigit = num%10;

            // to remove last digit from a number
            num = num/10;
            System.out.print(lastDigit);
        }
     
    }
}
