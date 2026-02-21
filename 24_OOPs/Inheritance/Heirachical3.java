package Inheritance;

public class Heirachical3 {

    public static void main(String[] args) {
        Comp c1 = new Comp();
        c1.loc();

        c1.floor = 5;
        c1.details();

        Entc e1 = new Entc();
        e1.loc();

        e1.floor = 4;
        e1.details();

    }
}

// base class
class College {

    int totFloors;

    void loc() {
        System.out.println("Located in Pune");
    }
}

// derived class 1
class Comp extends College {

    int floor;
    int totFaculty;

    void details() {
        System.out.println("I'm a computer department");
    }

}

// derived class 2
class Entc extends College {

    int floor;
    int totFaculty;

    void details() {
        System.out.println("I'm a Entc department");
    }

}

// derived class 3
class IT extends College {

    int floor;
    int totFaculty;

    void details() {
        System.out.println("I'm a IT department");
    }

}
