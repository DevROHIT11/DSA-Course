
public class ZeroAtEnd {

    public static void zero(int arr[]) {
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i != 0) {
                pos = i;
                arr[pos] = arr[i + 1];

            }
        }
    }
}
