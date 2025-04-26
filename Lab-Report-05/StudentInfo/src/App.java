import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StudentManagerList studentManager = new StudentManagerList();
        
        while (true) {
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    float marks = scanner.nextFloat();
                    Student student = new Student(rollNo, name, marks);
                    studentManager.addStudent(student);
                    break;

                case 2:
                    studentManager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRollNo = scanner.nextInt();
                    studentManager.searchStudent(searchRollNo);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please select again.");
            }}
    }
}
