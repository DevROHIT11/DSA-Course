import java.util.*;

public class Question1 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks = ");
        int marks = sc.nextInt();

        String result = (marks >= 33) ? "Passed " : "Fail ";
        System.out.println(result);
    }
}
