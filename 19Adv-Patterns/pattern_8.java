// HOLLOW RHOMBUS
//     *****
//    *   *
//   *   *
//  *   *
// *****

public class pattern_8 {

    public static void hollow_rhombus(int n) {

        // outer loop 
        for (int i = 1; i <= n; i++) {
            
            // for spaces
            for (int spaces = 1; spaces <= (n - i); spaces++) {
                System.out.print(" ");
            }

            // hollow rectangle wala code bhi chalega 
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

    // main function
    public static void main(String[] args) {

        // calling hollo rhombus  function
        hollow_rhombus(5);
    }
}
