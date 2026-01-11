// question 5 from array assignment

import java.util.Arrays;

public class Question_6 {

    public static void triplet(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                String b = "";
                for (int k = j; k < arr.length; k++) {

                    if(i != j && i != k && j != k && arr[i] + arr[j] + arr[k] == 0 ){
                        //  System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        int a[] = {arr[i] , arr[j] , arr[k]} ;
                      b.concat(Arrays.toString(a));
                      
                    } 
                } 
                System.out.print(b); 
            }
        }
    }

    // main function
    public static void main(String[] args) {
        // int arr[] = {0} ;
        int arr[] = {-1, 0, 1, 2, -1, -4};
        triplet(arr);
    }
}
