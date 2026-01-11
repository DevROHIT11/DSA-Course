// print inverted star pattern 
// alternate method rather than this method is used formula - stars = n-i+1
// where n = total number of lines , i = line number or current line 

public class Inverted_Star {
    public static void main(String[]  args ){
        for(int line = 1 ; line <= 10 ; line++){
            for(int star = 10 ; star >= line ; star-- ){
                System.out.print("* ");
            }
            System.out.println();
        }
    System.out.println();
    }
}
