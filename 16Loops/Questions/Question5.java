
public class Question5 {
    public static void main(String[]  args ){
        int num = 10899;
        int counter = 0;
        int rev = 0;
        while(num > counter ){
            int lastDigit = num %10;
            num /= 10;
            rev = (rev * 10) + lastDigit;
        }
        System.out.println(rev);
        
    }
}
