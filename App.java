//App Class
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student("Jamal");
        Student student2 = new Student("Kamal", 2, 3.56);
        Student student3 = new Student();

        Student[] students = new Student[50];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            if (student != null) {
                student.displayInfo();
            }
        }

    }
}
