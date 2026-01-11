
public class Promotion {
    
    public static void main(String[]  args ){
        char  a = 'a';
        char b = 'b';

        int  result = a + b;
        // char  result = a + b; 
    System.out.println(result);

    int num = 10;
    float num2 = 12.3f;
    double num3 = 3.14;

    // right method to convert double to int
    // int result2 = (int)(num + num2 + num3);

    double result2 =  (num + num2 + num3);
    System.out.println(result2);

    short  c = 10;

    // c = c * 5;
    // it treating now c as a short 
     c = (short) (c * 5);
    System.out.println(c);
    }
}
