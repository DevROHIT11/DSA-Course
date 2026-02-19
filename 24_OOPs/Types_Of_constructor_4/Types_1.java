public class Types_1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rohit", 21);
    }

}

class Student {

    String name;
    int age;

    // Non parametrized
    Student() {
        System.out.println("Constructor is called ...");
    }

    // parametrized
    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
}
