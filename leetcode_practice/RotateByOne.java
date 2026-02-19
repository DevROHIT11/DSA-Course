
public class RotateByOne {

    public static void reverse(int arr[]) {

        int n = arr.length;
        // reverse 
        for (int i = 0; i < n; i++) {
            arr[i] = arr[n - (i + 1)];
        }

        print(arr);
    }

    // print
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        reverse(arr);

    }

}
