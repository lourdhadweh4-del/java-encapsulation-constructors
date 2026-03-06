public class Laptop_Main {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop("Mac Book Pro", 265);

        myLaptop.setBrand("Lenovo");
        myLaptop.setRam(500);
        System.out.println("Brand: " + myLaptop.getBrand());
        System.out.println("Ram Memory Size: " + myLaptop.getRam());

    }
}
