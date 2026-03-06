public class Car3_Main {
    public static void main(String[] args) {

        Car3 Car1 = new Car3();
        Car3 Car2 = new Car3("Ford", "120E", 2025);

        System.out.println("Car1: " + "\n" + "Brand: " + Car1.getBrand() + "\n" + "Model: " + Car1.getModel() + "\n" + "Year: " + Car1.getYear());
        System.out.println("Car2: " + "\n" + "Brand: " + Car2.getBrand() + "\n" + "Model: " + Car2.getModel() + "\n" + "Year: " + Car2.getYear());

    }
}
