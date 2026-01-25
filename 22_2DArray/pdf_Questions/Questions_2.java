// Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

public class Questions_2 {

    public static void main(String[] args) {
        int[][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        int row = 1;
        int sum = 0;
        for (int j = 0; j < nums[row].length; j++) {
            sum += nums[row][j];
        }

        System.out.println("The sum is : " + sum);
    }
}
