package Inheritance;

public class Multi_level_Inheritance {

    public static void main(String[] args) {

        LMV bike = new LMV();

        // attributes and methods from base class
        bike.wheels = 2;
        bike.color = "Black";
        bike.details();
        System.out.println(bike.wheels + " Wheeler");

        // attributes and methods from 1st derived class
        bike.type = "LMV";
        bike.permit();

        // methods from 2nd derived class
        bike.print();

    }
}

// base class
class Vehicle {

    int wheels;
    String color;

    void details() {
        System.out.println(this.color);
    }
}

class Type extends Vehicle {

    String type;

    void permit() {
        System.out.println("All India Permit");
    }
}

class LMV extends Type {

    void print() {
        System.out.println("I'm a LMV vehicle");
    }
}
