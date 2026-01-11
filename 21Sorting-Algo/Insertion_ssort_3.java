public class Insertion_ssort_3 {
// print arr function
    public static void printArr(int arr[]) {
        int i = 0;
        while( i < arr.length){
            System.out.print( arr[i] +", ");
            i++;
        }
        
    }
    // insertion sort 
    public static void inserrtion(int arr[]){
        for(int i = 1 ; i <  arr.length ; i ++){
            int curr = arr[i] ;
           int prev = i-1;
        // finding out the right pos to insert
           while(prev >= 0 && arr[prev] > curr){
            arr[prev+ 1] = arr[prev] ;
            prev -- ;
           }
        // insertion
        arr[ prev+1 ] = curr ;
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3} ;
        inserrtion(arr);
        
    }
}
