
public class Constructor_3 {

    public static void main(String[] args) {

        // calling constructor
        Student s1 = new Student("Rohit", 21);
    }
}

class Student {

    String name;
    int age;

    Student(String n, int a) {
        this.name = n;
        this.age = a;

        System.out.println(name + " " + age);
    }
}
