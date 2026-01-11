
public class Selection_sort_2 {

    public static void printArr(int arr[]){
        for(int i  = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void Selection(int arr[]) {
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {
            // asuming the first position ele form unsorted array is min
            int minPos = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if (arr[j] < arr[minPos]  ) {
                    minPos = j ;
                }

            }
            // swapping 
            int temp = arr[minPos];
            // smallest ele pos
            arr[minPos] = arr[i] ;
            // curent post
            arr[i] = temp; 
        }
        printArr(arr);
    }

    // main function
    public static void  main(String[] args){
        int arr[] = {5,4,1,2,3} ;
        Selection(arr);
        
    }
};
