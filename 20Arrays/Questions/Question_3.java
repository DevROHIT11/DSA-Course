
public class Question_3 {

    // for subarrray
    public static void subarray(int arr[]) {

        int total_pairs = 0 ;

        // for start 
        for (int start = 0; start < arr.length; start++) {
            // for end
            for (int end = start; end < arr.length; end++) {
                // for printing
                int sum  = 0 ;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    
                    sum += arr[k] ;
                }
                // updatig total pairs
                total_pairs ++ ;
                System.out.println();
                System.out.println("{The sum is = " + sum + "}");
            }

            System.out.println();
        }
        System.out.println("total pairs = " + total_pairs);
        // for max sum of sub array
        max(arr);
        min(arr);
    }

    // function for max sum of array  
    public static void max(int arr[]){
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i] ; 
        }
        System.out.println("The max sum of subarray is = " + sum);
    } 
    // function for minimum sum of an array
    public static void min(int arr[]){
        // logic --> find the the smallest number from array and that is min sum 
        int max_infinity = Integer.MAX_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < max_infinity){
                max_infinity = arr[i] ;
            }
        }
        System.out.println("The Min sum of subarray is = " + max_infinity);
    }

    // main fucntion
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};
        // int arr[] = {1, -2 , 6, -1 , 3};
        subarray(arr);
    }
}
