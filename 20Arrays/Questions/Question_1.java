// reverse an array 
public class Question_1 {

    // require more space 

    // public  static void reverse(int arr[]){
    //     int new_arr[] = new int[arr.length] ;
    //     int len = arr.length - 1  ;

    //     for(int i = 0 ;  i <= arr.length-1 ; i ++){
    //         new_arr[ len - i ] = arr[i] ;
    //     }

    //     for(int j = 0 ; j <= new_arr.length-1 ; j ++){
    //         System.out.print( new_arr[j]+" ");
    //     }

    //  }

    // new method 
  
    public static void reverse (int arr[]){
        int first = 0;
        int last = arr.length - 1 ;

        
        while (first <= last ){
            int temp = arr[first];
            arr[first] = arr[last] ;
            arr[last] = temp ;
            first ++ ;
            last -- ;
        }

        // displaying array 
        for(int i = 0 ; i <= arr.length-1 ; i ++){
            System.out.print(arr[i] + " ");
        }

    }

    // main function
    public static void main(String[] args){

        int arr[] = {2, 4, 6, 8 , 10} ;
        reverse(arr);
    }
}

