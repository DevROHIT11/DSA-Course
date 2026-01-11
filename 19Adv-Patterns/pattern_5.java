// 0-1 triangle 
// 1
// 0 1 
// 1 0 1
// 0 1 0 1

public class pattern_5 {

    // 0-1 trinagle
    public static void  zero_one_trianlge(int rows){

        // outerr loop
        for(int i = 1 ; i <=rows; i++){

            // inner loop --> for pattern 
            for(int j = 1 ; j <= i ; j ++){
                // main logic
                if((i+j) % 2 == 0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");  
                }
            }
            System.out.println("");
        }
    }

    // main function
    public static void main(String[] args) {
        zero_one_trianlge(5);
    }
}
