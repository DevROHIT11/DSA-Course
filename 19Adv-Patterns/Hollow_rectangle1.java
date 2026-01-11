
public class Hollow_rectangle1 {

    // function for hollow rectangle
    public static void hollow_rect(int rows, int cols) {
        for (int row = 1; row <= rows; row++) {

            for (int col = 1; col <= cols; col++) {

                // condition for printing the stars at border
                if (row == 1 || row == rows || col == 1 || col == cols) {
                    System.out.print("* ");
                }
                // need to print the spaces to avoid misalign of pattern
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

    // main function
    public static void main(String[] args) {

        // calling the  function
        hollow_rect(4, 5);
    }
}
