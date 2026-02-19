
public class copy_constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rohit";
        s1.age = 21;

        s1.marks[0] = 96;
        s1.marks[1] = 100;
        s1.marks[2] = 89;

        // copying object 1 in object 2
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);

        // changing the marks of object 1 which will refelect in object 2 marks
        s1.marks[2] = 9;

        // printing the marks from array
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
