import java.util.* ;

public class Inbuilt_sort_4 {
  public static void main(String[] args){
    int arr[] = {4, 5, 1, 3, 2} ;
    Arrays.sort(arr , 0 , 3) ;
    System.out.println(Arrays.toString(arr));

    // sorting in descending order
    Integer num[] = {5 , 6  ,2 , 3 } ;
//    Arrays.sort(num , Collections.reverseOrder()) ;
    Arrays.sort(num ,0 , 3, Collections.reverseOrder()) ;
    System.out.println(Arrays.toString(num));
  }  
}
