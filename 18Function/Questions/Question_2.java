// to print the  primee numbers form given range of numbers 

public class Question_2 {

    // check prime
    public static boolean prime(int num) {
        boolean isPrime = true;
        if (num == 1 || num == 2) {
            isPrime = true;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;

    }

    //range
    public static void range(int n) {
        for (int i = 1; i <= n; i++) {
            boolean ans = prime(i);
            if (ans) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        range(10);
    }
}
