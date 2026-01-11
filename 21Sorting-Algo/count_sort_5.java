
import java.util.Arrays;

public class count_sort_5 {
    
    public static void countSort(int arr[]){
    //    range 
    int largest = Integer.MIN_VALUE ;
    for(int i  = 0;i < arr.length ; i++){
        largest = Math.max(largest , arr[i]);
    }
    // count array
    int count[] = new int[largest+1];
    System.out.println(Arrays.toString(count));
    for(int i = 0 ; i < arr.length ; i++){
        count[arr[i]] ++ ;
    }
    System.out.println(Arrays.toString(count));

    // sorting the arrray
    int j = 0 ;
    for(int i  = 0 ; i < count.length-1 ; i++){
      while(count[i] > 0){
        arr[j] = i;
        j++;
        count[i] -- ;
      }
    }
    System.out.println(Arrays.toString(arr));
        
    }
    public static void main(String[] args){
        int arr[] = {1,4,1,3,2,4,3,7};
        countSort(arr);
    }

}
