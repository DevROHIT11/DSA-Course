import java.util.* ;

public class Representation_1 {

    // searching the ele
    public static boolean search(int arr[][] , int key){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j  = 0 ; j < arr[i].length ; j++){
                if(key == arr[i][j]){
                    System.out.println("The ele found at (" + i + ")" + "(" + j + ")" + " index" );
                    return true;
                }
            }
        }
        System.out.println("Ele not found");
        return false;
    }
    // main function
    public static void main(String[] args){
        int matrix[][] = new int[3][3] ;
        Scanner sc = new Scanner(System.in);
        // taking input
        int r = matrix.length , c = matrix[0].length ;
        for(int i = 0 ; i < r ; i++){
            for(int j  = 0 ; j < c ; j ++){
                matrix[i][j] = sc.nextInt() ;
            }
        }
        // displaying the matrix
        for(int i = 0 ; i < r ; i++){
            for(int j  = 0 ; j < c ; j ++){
              System.out.print(matrix[i][j] + " ") ;
            }
            System.out.println();
        }

        // searching the element
        
        System.out.print("Enter the ele to search : " );
        int key = sc.nextInt() ;
        search(matrix, key);
    }
}
