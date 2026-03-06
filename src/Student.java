public class Student {
    private String name;
    private double grade;
    private boolean Passing;

    public Student() {
        name = "No Name";
        grade = 0.0;
        Passing = false;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;

    }
    public boolean getPassing() {
        return Passing;
    }
    public void setPassing(boolean Passing) {
        this.Passing = Passing;
    }
}
