// FLOYDS TRIANGLE 
// 1
// 2 3
// 4 5 6 
// 7 8 9 10


public class pattern_4 {

    public static void floyds_tri(int rows) {
        // for printing the numbers 
        int count = 1;
        
        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // inner loop for logic
            int j = 1 ;
            while(j <= i){
                System.out.print(count + "  ");
                count += 1 ;
                j ++ ;
            }
            System.out.println("");
        }
    }

    // main function 
    public static void main(String[] args) {
        
        floyds_tri(5);
    }
}
