public class Shallow_Deep {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "rohit";
        s1.age = 21;
        s1.marks[0] = 88;
        s1.marks[1] = 89;
        s1.marks[2] = 48;

        // copying the object
        Student s2 = new Student(s1);
        s1.marks[2] = 40;  // changing the marks

        // printing the marks
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {

    String name;
    int age;
    int marks[] = new int[3];

    Student() {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     // shallow copy
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;

        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
