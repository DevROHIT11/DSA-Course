// print charaacter pattern
/*
 A
 AB
 ABC
 ABCD
 */
public class Character_pattern {
    public static void main(String[]  args ){

        //   for(char ch = 'A' ; ch <= 'z' ; ch++ ){
        //     System.out.print(ch + " ");
        // }
        
        int n = 4;
        char ch = 'A';
        for(int line = 1; line <= n ; line++){
            for(int chars = 1 ; chars <= line ; chars++){
                System.out.print(ch);
                ch++ ;
            }
            System.out.println();
        }
      
        
    }
}
