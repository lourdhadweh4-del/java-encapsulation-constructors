public class Circle extends Shape {
    private double r;
    private double area;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;

    }
}
