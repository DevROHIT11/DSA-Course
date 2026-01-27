
public class String_equals_2 {

    public static void main(String[] args) {
        String s1 = "Tonu";
        String s2 = "Tonu";
        String s3 = new String("Tonu");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if (s1.equals(s3))
        if (s1 == s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
