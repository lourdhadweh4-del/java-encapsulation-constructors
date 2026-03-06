public class Manager1 extends Employee {

    public Manager1(double salary) {
        super(salary);

    }
    @Override
    public void work() {
        System.out.println("Manager is overseeing the team! ");
    }
    public void holdManager() {
        System.out.println("Manager is holding a meeting! ");
    }
}
