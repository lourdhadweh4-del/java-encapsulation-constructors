public class Car2_Main {
    public static void main(String[] args) {

        Car2 myCar = new Car2();
        Car2 myCar1 = new Car2("Ford", "NE11");
        Car2 myCar2 = new Car2("Toyota", "Nf12", 2025);

        System.out.println("Car1 Brand: " + myCar.getBrand() + "\n" + "Model: " + myCar.getModel() + "\n" + "Year: " + myCar.getYear());
        System.out.println("Car2 Brand: " + myCar1.getBrand() + "\n" + "Model: " + myCar1.getModel());
        System.out.println("Car3 Brand: " + myCar2.getBrand() + "\n" + "Model: " + myCar2.getModel() + "\n" + "Year: " + myCar2.getYear());
    }
}
