// SOLID RHOMNBUS
//     * * * * *
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *


public class pattern_7 {

    // function for solid rhombus
    public static void solid_rhombus(int n){
        for(int i = 1 ; i <=n ; i++){

            // loop for printing spaces
            for(int spaces = 1 ; spaces <= (n-i) ; spaces++ ){
                // printing spaces
                System.out.print(" ");
            }
            System.out.print("* * * * *");
            System.out.println("");
        }
    }

    // main function
    public static void main(String[] args) {
        
        // calling pattern function
        solid_rhombus(5);
    }
}
