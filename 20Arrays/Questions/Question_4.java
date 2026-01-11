
// import java.util.Arrays;
import java.util.*;

// sum of subarray using prefix array
public class Question_4 {

    // making prefix array
    public static void prefix_arr(int arr[]) {

        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;

        int prefix[] = new int[arr.length];

        // I define zero here becoz when prefix[i-1] for 0 will give prefix[-1] and hence -1 is not a index in array
        prefix[0] = arr[0];
        
        // for loop for prefix array storing elements
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        // printing the prefix array 
        System.out.println("Prefix Array : " + Arrays.toString(prefix));

        // calcuating the sum of subarrray
        for (int start = 0; start < arr.length; start++) {
            int currSum = 0;

            for (int end = start; end < arr.length; end++) {

                // function to calculate the sum of sub array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println(currSum);

                // for finding the max value
                if (currSum > max_num) {
                    max_num = currSum;
                }
                // for finding the min value
                if (currSum < min_num) {
                    min_num = currSum;
                }
            }
        }
        System.out.println("The Max Sum of subarray is : " + max_num);
        System.out.println("The Min Sum of subarray is : " + min_num);

    }

    // main function
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        prefix_arr(arr);
    }

}
