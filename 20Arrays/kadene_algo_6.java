// used to calculate the sum of subarrays and find max sum
// the most efficient method than prefix array

public class kadene_algo_6 {

    public static void kadane(int arr[]) {

        // checking the array is of -ve ele if negative then return the smallest -ve ele 
        int chek = check(arr);
        if (chek < 0) {
            System.out.println("The max sum of sub array is : " + chek);
        } else {
            // kadane's algo start from here 
            int currSum = 0;
            int max_sum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                currSum += arr[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                max_sum = Math.max(currSum, max_sum);
            }
            System.out.println("The Max sum is = " + max_sum);
            System.out.println("The curr sum is = " + currSum);
        }

    }

    // function to check if the array is of negative numbers
    public static int check(int arr[]) {
        int min = Integer.MAX_VALUE;
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                pointer++;
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        if (pointer == arr.length) {
            return min;
        } else {
            return 0;
        }
    }

    // main function
    public static void main(String[] args) {

        // int arr[] = {-2, -3, -4, -1, -2, -1, -5, -3};

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadane(arr);
    }

}
