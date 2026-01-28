// QUESTION -> converting the first and the letter after the space to uppercase 

public class uppercase {

    public static String toUppercase(String str) {

        StringBuilder sb = new StringBuilder("");
        // for 1st letter 
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            // letter after space
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                // appending space as it is 
                sb.append(str.charAt(i));
                i++;
                // converting the letter after space to upper case
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                // other letters as it is 
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "kattar mumbai indians samarthak";

        System.out.println(toUppercase(str));
    }
}
