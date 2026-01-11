// linear search -- > searching the elements in array one by one on each index

public class Linear_serach_3 {
    
    public static int linear_search(int arr[] , int key){

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key){
                return i ;
            }
        }
        return -1 ;
    }
    // main function
    public static void main(String[] args){

        int num[] = {2 , 4, 6, 8, 10, 12, 14, 16} ;
        int key = 12;

        // String menu[] = {"dosa" , "samosa" , "idli" , "kachori" , "poha"} ;
        // String item = "samosa" ; 

        // caling the linear search function
        int index = linear_search(num, key);

        // int index = linear_search(menu, item) ;

        // verifying the result 
        if(index >= 0){
            System.out.println("Key found at index " + index);
        }
        else{
            System.out.println("Key not found");
        }

    }
}
