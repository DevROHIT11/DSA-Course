
public class Palindrome {

    // public static void check(String str) {
    //     String temp = "";
    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         temp += str.charAt(i);
    //         System.out.println(str.charAt(i));
    //     }
    //     if (temp.equals(str)) {
    //         System.out.println("The String is palindorme");
    //     } else {
    //         System.out.println("The String is not palindorme");
    //     }
    // }
    public static boolean check(String str) {
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "rohit";
        if (check(str)) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("The String is not palindrome");
        }
    }
}
