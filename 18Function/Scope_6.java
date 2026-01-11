// method scope and block scope

public class Scope_6 {
    
    // E.g for method scope
    public static void method(){

        // trying to acces the variable before its decalaration
        // System.out.println(a);

        int a = 10;
        System.out.println(a);
    }

    public static void main( String[]  args){

        // cant accesed the variable outside the method
        //  System.out.print(a);


        // ************BLOCK SCOPE***********************
        {
            int b = 10;
            System.out.println(b);
        }

        // trying to acces the variable outside the block
        // System.out.println(b);
    }
}
