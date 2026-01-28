
public class String_Builder_4 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); //TC = O(26)

            // sb += ch ;  TC = O(26 * n*n)
        }
        System.out.println(sb);
    }
}
