// prinnt the number given by user until it is multiple of 10

import java.util.*;
public class Question6 {
    public static void main(String[]  args ){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number = ");
            int num = sc.nextInt();
            int check = num%10;
            if(check == 0){
                break;
            }else{
                System.out.println(num);
            }
        }
    }
    
}
