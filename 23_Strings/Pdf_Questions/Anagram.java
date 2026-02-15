
public class Anagram {

    public static int found(String s1, String s2) {
        int found = 0;

        if (s1.length() != s2.length()) {
            return found;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {

                    if (s1.charAt(i) == (s2.charAt0(j))) {
                        found++;
                    } else {
                        found = 0;
                    }
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        String str1 = "evil";
        String str2 = "vile";

        if (found(str1, str2) == 0) {
            System.out.println("The strings are not anagram");
        } else {
            System.out.println("The strings are anagram");
        }
    }
}
