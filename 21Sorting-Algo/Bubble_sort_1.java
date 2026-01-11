import java.util.Arrays;

public class Bubble_sort_1 {
    public static void bubble(int arr[]){
        int swap = 0 ;
         for(int i = 0 ; i <= arr.length -2 ; i ++){
             
            for(int j = 0 ; j < (arr.length - 1) -i ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] =  arr[j+1];
                arr[j+1] = temp ;
                swap ++ ;
            }
            }
         }
         System.out.println(Arrays.toString(arr));
         System.out.println("The swaps require to sort array are : "+swap);
    }

    // main function
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5} ;
        int arr[] = {5, 4, 1, 3 , 2 } ;
        bubble(arr);
    }
   
}
