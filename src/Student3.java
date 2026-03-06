public class Student3 {
    private String name;
    private int id;
    private double grade;

    public Student3() {
        this ("Peter", 782977, 100);
    }
    public Student3(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;

    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
