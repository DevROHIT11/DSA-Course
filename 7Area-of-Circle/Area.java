import java.util.*;

public class Area {
    public static void main(String[]  args ){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Radius = ");
        float radius = obj.nextFloat();

        double Area = 3.14 * radius * radius ;
    System.out.println(Area);
    }
}
