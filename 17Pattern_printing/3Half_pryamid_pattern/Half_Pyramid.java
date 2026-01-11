// print a half-way pyramid
/*
 1
 12
 123
 1234
 */

public class Half_Pyramid {
    public static void main(String[]  args ){
        for(int line = 1 ; line <= 4 ; line ++){
            for(int j = 1 ; j <= line ; j++ ){
                System.out.print(j);
            }
        System.out.println();
        }
    }
}
