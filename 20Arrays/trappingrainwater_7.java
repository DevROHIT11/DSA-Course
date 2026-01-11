// traping rainwater question 

import java.util.Arrays;

// find out how much water can be trapbetween the bars
public class trappingrainwater_7 {

    // function for left auxilary array (left side max values for each bar ) with return type of function is  array
    public static int[] left_aux(int arr[]) {

        int left_aux[] = new int[arr.length];

        // loop for height array ele
        for (int i = 0; i < arr.length; i++) {

            int max_val = Integer.MIN_VALUE;
            // for left sside boundary condtion 
            if (arr[i] == arr[0]) {
                left_aux[0] = arr[0];

            } else {
                // loop for finding left max for other ele than left boundary
                max_val = Math.max(arr[i], left_aux[i - 1]);

                // storing the left-max of each bar in left auxialry array
                left_aux[i] = max_val;
            }

        }
        // returning an left array
        return left_aux;
    }

    // function for right auxilary array (right side max values for each bar ) with return type of function is  array
    public static int[] right_aux(int arr[]) {

        int right_aux[] = new int[arr.length];

        // loop for height array ele accessing
        for (int i = arr.length - 1; i >= 0; i--) {

            int max_val = Integer.MIN_VALUE;

            // for right sside boundary condtion 
            if (arr[i] == arr[arr.length - 1]) {
                right_aux[arr.length - 1] = arr[arr.length - 1];
            } else {
                // loop for finding right max for other ele than left boundary
                max_val = Math.max(arr[i], right_aux[i + 1]);

                // storing the right-max of each bar in right auxialry array
                right_aux[i] = max_val;
            }

        }

        // returning an right array
        return right_aux;
    }

    // function to calculate the trapping rainwater 
    public static void trap_water(int arr[], int left[], int right[]) {
        int width = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // w = min(left_aux , right_aux) 
            // x = height of current bar
            // formula : total capacity of single bar to trap water =  (w-x) * width 
            int w = Math.min(left[i], right[i]);
            int x = arr[i];

            // calculating the capacity of single bar to hold rainwater
            int trap_water = (w - x) * width;

            // for the bars who can't hold the water 
            if (trap_water < 0) {
                trap_water = 0;
            }

            // total trap water
            sum += trap_water;

            // System.out.println(trap_water);
        }
        System.out.println("The total trap water is : " + sum);
    }

    // main function
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int left[] = left_aux(arr);
        int right[] = right_aux(arr);

        // printing the auxilary arrays
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        // trap water function
        trap_water(arr, left, right);
    }
}
