// finding the largest element in array 
// largest = - infinity 

public class Largest_of_array_4 {

    // function for finding the largest ele in array
    public static int largest( int arr[]){
        // for largest -infinty value
        int largest = Integer.MIN_VALUE ;

        // loop 
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] >=  largest ){
                // updating the largest
                largest = arr[i] ;
            }
        }
        return  largest ;
    }

    public static void main(String[] args ){
        int arr[] = {1 ,2 ,6 , 12 , 5};

        System.out.println( "The largest element in array is "+largest(arr));
    }
    
}
