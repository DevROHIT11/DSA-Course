// BUTTERFLY PATTERN
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class pattern_6 {
    
// function for first half
    public static void first_half(int n ){

        for(int i = 1; i <= n ; i++  ){

            // for stars
            for(int stars = 1 ; stars <= i ; stars ++){
                System.out.print("*");
            }
            // for spaces
            for(int spaces = 1 ; spaces <= 2*(n-i) ; spaces++){
                System.out.print(" ");
            }
            // for stars
            for(int stars = 1 ; stars <= i ; stars ++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // fucntion for second half
    public static void second_half(int n ){

        for(int i = n; i >= 1 ; i--  ){

            for(int stars = 1 ; stars <= i ; stars ++){
                System.out.print("*");
            }
            for(int spaces = 1 ; spaces <= 2*(n-i) ; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1 ; stars <= i ; stars ++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // main function
    public static void main(String[] args) {

        first_half(4);
        second_half(4);
    }
}
