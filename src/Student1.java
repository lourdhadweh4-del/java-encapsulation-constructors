public class Student1 {
    private int studentId;
    private String studentName;
    private double grade;


    public Student1() {
        this(0, "Unknown", 0.0);  // constructor chaining
        System.out.println("Default constructor called: ");

    }

    public Student1(int studentId, String studentName, double grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        System.out.println("Parameterized constructor called: ");
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;

    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

}
