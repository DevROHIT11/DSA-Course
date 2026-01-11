
public class Conditions {
    public static void main(String[]  args ){

        boolean check = false;
        if(check){
            System.out.println("Passed");
        }
        else{
            System.out.println("fail");
        }

        // if-else_if-else
        int age = 15; 
        if(age >=18 ){
            System.out.println("Adult");
        } 
        else if(age >= 13 && age < 18 ){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");

        }

        // if-if-if
        int num = 4;
        if(num <=10){
            System.out.println("Less than 10");
        }
        if(num >=5 && num < 10 ){
            System.out.println("Less than 10 but grater than 5");
        }
        if(num > 0 && num<5){
            System.out.println("Greater than 0 but less than 5");
        }
    }
}
