// PASSING ARRAY AS AGUMENTS -- PASS BY REFERNCE 
// THE VALUE CHANGED IN FUCNTION ALSO CHANGED IN MAIN FUNCTION THIS IS CALLED AS PASS BY REFERENCE 

public class arrays_2 {
    public static void update(int marks[]){

        // updating the existing marks by 1 
        for (int i = 0 ; i < marks.length ; i++){
            marks[i] = marks[i] + 1 ;
        }

    }

    // main function
    public static void main(String[] args) {
        
        int marks[] = {99 , 96 , 98 , 85} ; 
        
        update(marks);

        // printing marks one by one 
        for (int i = 0 ; i < marks.length ; i ++){
            System.out.print(marks[i] + " ");
        }
    }
}
