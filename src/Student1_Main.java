public class Student1_Main {
    public static void main(String[] args) {

        Student1 Student = new Student1();
        Student1 Student2 = new Student1(122, "Peter", 99.3);
        System.out.println("Student 1: " + "\n" + "ID: " + Student.getStudentId() + "\n" + "Name: " + Student.getStudentName() + "\n" + "Grade: " + Student.getGrade());
        System.out.println("Student 2: " + "\n"  + "ID: " + Student2.getStudentId() + "\n" + "Name: " + Student2.getStudentName() + "\n" + "Grade: " + Student2.getGrade());

    }
}
