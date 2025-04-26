import java.util.ArrayList;
import java.util.List;

public class StudentManagerList {
    private List<Student> students;

    public StudentManagerList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public void searchStudent(int rollNo) {
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with roll number " + rollNo + " not found.");
    }
}
