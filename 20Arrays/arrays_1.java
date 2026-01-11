import java.util.*;

public class arrays_1 {
    public static void main(String[] args) {
        
        // 1. creating array
        int arr[] = new int[5];

        // array length
        System.err.println(arr.length);

        // infintite size array
        int num[] = {1 , 2 , 3} ;
        System.out.println(num);

        // 2. taking input in array
        int marks[] = new int[100] ; 

        Scanner sc = new Scanner(System.in) ;

        marks[0] = sc.nextInt() ; //math marks 
        marks[1] = sc.nextInt() ; // phy marks
        marks[2] = sc.nextInt() ; // chem marks 

        System.out.println("Maths = " + marks[0]);
        System.out.println("Physics = " + marks[1]);
        System.out.println("Chemistry = " + marks[2]);

        // 3. updating the values in array 
        marks[0] = marks[0] + 1 ;
        System.out.println("Maths = " + marks[0]);

            // calculating the percentage 
            float percentage = (marks[0] + marks[1] + marks[2]) / 3 ;
            System.out.println("Percentage = " + percentage + " %");

        // 4. Length of array 
        System.err.println(marks.length);

    }
}
