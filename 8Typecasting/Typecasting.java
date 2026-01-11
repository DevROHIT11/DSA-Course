public class Typecasting {
    public static void main(String[]  args ){

        float num = 3.56f;
        int b = (int) num;

        // no need to define datatype for char in which we are converting
        char ch = 'a';
        int num2 = ch;

        System.out.println(b);
        System.out.println(num2);
    }
}
