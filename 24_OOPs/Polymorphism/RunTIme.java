// Runtime poly happens when the code is executing 
// method overriding 
// parent class and child class contains the function

public class RunTIme {

    public static void main(String[] args) {

        vehicle v = new vehicle();
        v.color();

        bmw b = new bmw();
        b.color();

    }

}

class vehicle {

    void color() {
        System.out.println("red");
    }

}

class bmw extends vehicle {

    void color() {
        System.out.println("black");
    }

}
