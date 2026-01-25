
public class DiagomalSum {

    public static void diagonalSum(int matrix[][]) {
        int sum = 0;

        // THIS IS AN BRUTE FORCE LOGIC (T.C = O(n2))
        // for(int i=0 ; i<= matrix.length-1 ; i++){
        //     for(int j=0 ; j<=matrix[0].length ; j++){
        //         // primary diagonal
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }
        //         // secondary diagonal
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // OPTIMIZE LOGIC (TC = O(n))
        for (int i = 0; i < matrix.length; i++) {
            // System.out.println(matrix[i][i]);
            // PD
            sum += matrix[i][i];
            // SD
            if (i != matrix.length - 1 - i)// this conditions checks the PD ele is not in SD in n x m = odd 
            {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("The sum is : " + sum);
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        diagonalSum(matrix);
    }
}
