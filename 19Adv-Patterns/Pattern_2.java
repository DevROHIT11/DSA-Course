// printing the inverted-rotated half pyramid

public class Pattern_2 {

    // function for pattern
    public static void Inverted_rotated_Half_pyramid(int r, int c) {
        int lower_limit = 1 + c;
        int upper_limit = r + c;
        for (int rows = 1; rows <= r; rows++) {
            for (int col = 1; col <= c; col++) {

                if (lower_limit <= (rows + col) && (rows + col) <= upper_limit) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

    // main function
    public static void main(String srgs[]){

        // callin the pattern function 
        Inverted_rotated_Half_pyramid(4, 4);
    }
}
