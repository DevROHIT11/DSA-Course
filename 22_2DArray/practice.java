
public class practice {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] right(int arr[]) {
        int max = Integer.MIN_VALUE;
        int[] right_aux = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                right_aux[arr.length - 1] = arr[arr.length - 1];
            } else {
                right_aux[i] = Math.max(arr[i], right_aux[i + 1]);
            }

        }
        return right_aux;
    }

    public static int[] left(int arr[]) {
        int max = Integer.MIN_VALUE;
        int[] left_aux = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                left_aux[0] = arr[i];
            } else {
                left_aux[i] = Math.max(arr[i], left_aux[i - 1]);
            }

        }
        return left_aux;
    }

    public static void totalwater(int right_aux[], int left_aux[], int arr[]) {

        int area = 0;
        int width = 1;
        for (int i = 0; i < arr.length; i++) {
            int water_level = Math.min(right_aux[i], left_aux[i]);
            area += (water_level - arr[i]) * width;
        }
        System.out.println("The total water trapped is = " + area);
    }

    public static void main(String[] args) {

        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        print(right(arr));
        print(left(arr));
        totalwater(right(arr), left(arr), arr);

    }
}
