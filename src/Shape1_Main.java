public class Shape1_Main {
    public static void main(String[] args) {
        Shape1 myShape = new Shape1();
        Square mySquare = new Square(6);

        System.out.println(myShape.getArea());
        System.out.println(mySquare.getArea());
    }
}
