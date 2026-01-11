// make pair of an ele in array

public class Question_2 {

    public static void pair(int arr[]) {

        int len = arr.length;
        int second_last = arr.length - 2;
        int total_pairs = 0 ;

        for (int i = 0; i <= second_last; i++) {
            for (int j = (i+1); j < len; j++) {

                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                total_pairs ++ ;
            }
            System.out.println("");
        }
        System.out.println("Total Pairs = " + total_pairs);
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};
        pair(arr);
    }
}
