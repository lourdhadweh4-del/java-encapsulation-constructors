public class Phone1_Main {
    public static void main(String[] args) {

        Phone1 myPhone = new Phone1("Apple" , 1200.20);

        myPhone.setModel("Samsung");
        myPhone.setPrice(1300.30);
        System.out.println("Phone Model: " + myPhone.getModel());
        System.out.println("Price: " + myPhone.getPrice());
    }
}
