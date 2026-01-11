
public class Question3 {
    public static void main(String[]  args ){
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<4 ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("Alternate method .............");
        // alternate method
        for(int line=0; line<4; line++){
            System.out.println("* * * * ");
        }
        
    }
}
