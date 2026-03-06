public class StartUp_Main {
    public static void main(String[] args) {

        System.out.println("App Version before creating object: " + StartUp.appVersion);
        StartUp myStartUp = new StartUp();
        System.out.println("App Version before creating object: "  + StartUp.appVersion);
    }
}
