
public class Hybrid_4 {

    public static void main(String[] java) {

        Shark s1 = new Shark();
        s1.breathes();
        s1.fins = 4;
        System.out.println("Sharks has " + s1.fins + " fins");
        s1.food();

        Humans h1 = new Humans();
        h1.legs = 2;
        h1.hands = 2;
        System.out.println("Humans has " + h1.hands + " hands and " + h1.legs + " legs");
        h1.details();
    }
}

// root class
class Animal {

    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breathes() {
        System.out.println("Breathes");
    }
}

class Fish extends Animal {

    int fins;

    void swims() {
        System.out.println("Swims");
    }
}

class Shark extends Fish {

    void food() {
        System.out.println("Eats small fishes");
    }
}

class Bird extends Animal {

    int size;

    void fly() {
        System.out.println("flies");
    }
}

class Peacock extends Bird {

    int legs;

    void details() {
        System.out.println("Peacock is a national bird");
    }
}

class Mammals extends Animal {

    int legs;

    void walk() {
        System.out.println("Walks");
    }
}

class Dog extends Mammals {

    int legs;
    boolean ear;

    void sound() {
        System.out.println("Bow bow");
    }
}

class Humans extends Mammals {

    int legs;
    int hands;

    void details() {
        System.out.println("Human is very intelligent animal");
    }
}
