// In compile time poly we can see that where is the polymorphism happening in the code 
// METHOD OVERLOADING

public class CompileTime {

    public static void main(String[] args) {

        Calculation c = new Calculation();

        System.out.println(c.sum(2, 3));

        System.out.println(c.sum((float) 4.12, (float) 3.2));

        System.out.println(c.sum(2, 3, 4));

    }

}

class Calculation {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
