
public class copy_constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.age = 21;

        s1.marks[0] = 96;
        s1.marks[1] = 100;
        s1.marks[2] = 89;

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);

        s1.marks[2] = 9;

        for (int i = 0; i < s2.marks.length; i++) {

            System.out.print(s2.marks[i] + " ");
        }

    }

}

class Student {

    String name;
    int age;
    int marks[] = new int[3];

    // parametrized
    Student() {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    Student(Student s1) {

        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;

    }

}
