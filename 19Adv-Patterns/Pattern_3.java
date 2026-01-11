// Pirnting the INVERTED HALF PYRAMID WITH NUMBERS

public class Pattern_3 {

    public static void pattern_3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= (n-rows)+1 ; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // main function
    public static void main(String[] args) {
        
        // calling the pattern function
        pattern_3(10);
    }
}
