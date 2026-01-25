
import java.util.*;

public class SortedArraySum {

    // MY LOGIC
    // public static void search(int matrix[][], int key) {
    //     int n = matrix.length;
    //     int iteration = 0;
    //     for (int j = 0; j < n; j++) {
    //         if (key == matrix[0][j]) {
    //             System.out.println("Element found at [" + 0 + "][" + j + "]" + "position");
    //         } else if (key == matrix[n - 1][j]) {
    //             System.out.println("Element found at [" + (n - 1) + "][" + j + "]" + "position");
    //         } else if (key > matrix[0][j] && key < matrix[n - 1][j]) {
    //             iteration++;
    //             for (int i = 0; i < n; i++) {
    //                 if (key == matrix[i][j]) {
    //                     System.out.println("Element found at [" + i + "][" + j + "]" + "position");
    //                     System.out.println(iteration);
    //                     break;
    //                 }
    //             }
    //         } else {
    //             System.out.println("Not found");
    //         }
    //         // for(int j = 0 ; j < matrix.length ; j++){
    //         //     if(j == 0 || j == matrix.length -1){
    //         //         if(key == matrix[i][j]){
    //         //             System.out.println("Element found at [" + i + "] [" + j + "]" + "position" );
    //         //         }
    //         //         else{
    //         //             System.out.println("Element not found");
    //         //         }
    //         //     }
    //         // }
    //     }
    // }
    // SHRADDHA LOGIC (TC = O(n+m) -> worst case)
    public static void search(int matrix[][], int key) {

        int n = matrix.length;
        int row = n - 1;
        int col = 0;

        while (col < n && row >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Element found at (" + row + "," + col + ")");
                break;
            } else if (key < matrix[row][col]) {
                row--;
            } else if (key > matrix[row][col]) {
                col++;
            } else {
                System.out.println("Oops !!, Element not found.");
            }

        }

    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element to search : ");
        int key = sc.nextInt();

        search(matrix, key);
    }
}
