public class Shape3_Main {
    public static void main(String[] args) {

        Shape3 myShape = new Shape3();
        Rectangle3 myRectangle = new Rectangle3(8, 9);

        System.out.println(myShape.getArea());
        System.out.println(myRectangle.getArea());
    }
}
