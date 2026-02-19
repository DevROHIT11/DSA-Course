// Stiver sheet question 
// https://takeuforward.org/data-structure/check-if-an-array-is-sorted
// CHECKING THE ARRAY IS SORTED OR NOT 

public class Solution {

    public static boolean sorted(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[0] < arr[arr.length - 1] && arr[i] > arr[i + 1]) {
                return false;
            } else if (arr[0] > arr[arr.length - 1] && arr[i] < arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        // int arr[] = {1, 2, 3, 4, 5};
        // int arr[] = {7, 5, 1, 4, 3};

        if (sorted(arr)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
