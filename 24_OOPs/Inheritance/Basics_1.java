
public class Basics_1 {

    public static void main(String[] args) {

        // derivesd class objects
        Fish shark = new Fish();

        // methods from base class
        shark.eats();
        shark.breathes();
    }
}

// base class
class Animal {

    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

// derives class
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims");
    }

}
