
public class StringCompression {

    public static String compression(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            counter++;
            // aaabbcccdd
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }
            sb.append(str.charAt(i));

            if (counter > 1) {
                sb.append(counter);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compression(str));
    }
}
