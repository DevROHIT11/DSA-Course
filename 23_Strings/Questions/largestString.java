// comparing the string --> this function basically compares the string in lexographic order
//  str1 < str2 = -ve
// str1 > str2 = +ve
// str1 = str2 = 0

public class largestString {

    public static String compare(String[] str) {
        String largest = str[0];
        int result = 0;

        for (int i = 1; i < str.length; i++) {

            result = largest.compareToIgnoreCase(str[i]);
            if (result < 0) {
                largest = str[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        String[] str = {"apple", "mango", "banana"};

        System.out.println(compare(str));
    }
}
