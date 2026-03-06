public class Rectangle3 extends Shape3 {
    private double length;
    private double width;

    public Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
