// converting binary to decimal 

public class Question_3 {

    public static void binTOdec(int num) {
        int dec = 0;
        int power = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                dec = dec + (int) (lastDigit * Math.pow(2, power));
                power++;
                num = num / 10;

            }
            System.out.println(dec);

    }

    public static void main(String[] args) {
        int binary_num = 1011;
        binTOdec(binary_num);
    }

}
