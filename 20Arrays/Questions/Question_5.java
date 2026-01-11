// returns true if value is twice in array if not then return false

public class Question_5 {

    public static void repeat(int arr[]) {
        boolean update = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    update = true;
                    break;
                }

            }

        }
        System.out.println(update);
    }

    // main function
    public static void main(String[] args) {

         int arr[] = {1,2,3,1} ;
        // int arr[] = {1,2,3,4} ;
        // int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        repeat(arr);
    }
}
