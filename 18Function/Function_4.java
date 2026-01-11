// binomial coeff = nCr = n!/r!(n-r)!
// for  finding binomial coeff we will use helper function which will be factorial function

public class Function_4{

    // helper factorial function
    public static int fact(int num){
        int fact  = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }

    // funciton to calculate binomial coeff 
    public static void bin_coeff(int n , int r){

        int n_r = n-r;

         // getting factorials
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_r_fact = fact(n_r);

        // binomial coeff formula 
        int b_coeff = n_fact / (r_fact * n_r_fact) ;

        System.out.println("The binomial coeff is = " +  b_coeff);
    }

    public static void main(String[] args){

        int n = 10;
        int r = 5;
        
        bin_coeff(n, r);
       
    }
}
