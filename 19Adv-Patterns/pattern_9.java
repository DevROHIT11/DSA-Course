public class pattern_9 {
    public static void diamond(int n){

        // first half
        for(int i = 1 ; i <= n ; i ++){
            // for starting spaces
            for(int spaces = 1 ; spaces <= (n-i) ; spaces++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1 ; j <= ((2*i)-1) ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        // second half
        for(int i = n ; i >= 1 ; i --){
            // for starting spaces
            for(int spaces = 1 ; spaces <= (n-i) ; spaces++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1 ; j <= ((2*i)-1) ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        diamond(5);
    }
}
