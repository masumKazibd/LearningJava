class Student {
    private int rollNo;
    private String name;
    private float marks;

    public Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }

    public int getRollNo() {
        return rollNo;
    }
}
