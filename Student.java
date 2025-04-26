//Student Class

public class Student {
    static int count = 0;
    String name; // Instance Variable
    int rollNo; // Instance Variable
    double cgpa; // Instance Variable

    Student() {
        this.name = null;
        this.rollNo = -1;
        this.cgpa = 0.00;
        count++;
    }

    Student(String nm) {
        this();
        this.name = nm;
    }

    Student(String nm, int roll, double cg) {
        this();
        this.name = nm;
        this.rollNo = roll;
        this.cgpa = cg;
    }

    void displayInfo() {
        System.out.println("******************************");
        System.out.println("Hi my name is: " + this.name);
        System.out.println("Roll: " + this.rollNo);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("******************************");
    }

    void sayAge() {
        int age = 5; // Local variable
        System.out.println("Geeting! i'm " + age + "years old.");
    }
}
