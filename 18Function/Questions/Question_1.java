// check whether the number is prime or not 
// PRIME NUMBERS -> THE NUMBER IS DIVISIBLE BY 1 AND ITSELF
//  num % 1 == 0 and num % num ==0;

public class Question_1 {

    // function to check prime number
    public static int prime(int num){

         // for 2 --> 2 is prime number
            if(num == 2){
                System.out.println(num + " is prime number");      
            }
        // main condition 
            for(int i = 2 ; i <= num-1 ; i++){

           

            if(num % i == 0 ){
                System.out.println(num +" is not prime number ");
                break;
            }
            else{
                System.out.println(num + " is prime number");
                break;
            }
        } 
        return 0;
    }

    public static void main(String[] args) {
        prime(50);
    }
    
}
