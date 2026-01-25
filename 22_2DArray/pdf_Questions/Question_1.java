
public class Question_1 {

    public static int check(int arr[][], int num) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (num == arr[i][j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] array = {
            {4, 7, 8},
            {8, 8, 7}
        };

        int num = 7;

        System.out.println(check(array, num));
    }
}
