// Ternary operator ( ? )
public class Ternary {
    public static void main(String[]  args ){
        int var = (5<3)?5:3;
        System.out.println(var);

        int num = 5; 
        String check = (num %2 == 0) ? "The num is Even ":"The num is odd";
        System.out.println(check);
    }
}
