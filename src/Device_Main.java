public class Device_Main {
    public static void main(String[] args) {
        Device myDevice = new Device();
        Phone2 myPhone = new Phone2();

        myDevice.turnOn();
        myPhone.turnOn();
        myPhone.call();
    }
}
