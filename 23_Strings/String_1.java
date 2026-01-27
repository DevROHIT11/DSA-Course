
public class String_1 {

    public static void chara(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);

        // String is a class
        String str2 = new String("xyz");
        System.out.println(str2);

        // taking string as a input
        // Scanner sc = new Scanner(System.in);
        // Dont't print the string after space
        // String name = sc.next();
        // complete line
        // String name = sc.nextLine();
        // length of the string
        // System.out.println(name);
        // System.out.println(name.length());
        // concatenation
        String firstName = "Rohit";
        String lastName = "Bhalekar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is this"); //this is also concatenation

        // charAT
        System.out.println(fullName.charAt(0));
        // printing all characters
        chara(fullName);

    }
}
