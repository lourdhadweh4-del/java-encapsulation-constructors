public class Shape_Main {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        Circle myCircle = new Circle(6);
        System.out.println(myShape.getArea());
        System.out.println(myCircle.getArea());
    }
}
