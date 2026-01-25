
public class Question_3 {

    public static void Transpose(int arr[][]) {

        int[][] matrix = new int[3][2];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                matrix[i][j] = arr[j][i];
            }
        }

        // display matrix
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{11, 12, 13}, {21, 22, 23}};

        Transpose(nums);
    }
}
