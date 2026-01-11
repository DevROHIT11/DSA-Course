// to break any loop at a condition

public class Break {
    public static void main(String[]  args ){
        for(int i = 0 ; i < 10 ; i++){
            if(i == 6){
                break;
            }
            System.out.println(i);

        }
    System.out.println("I am out of the loop");
    }
}
