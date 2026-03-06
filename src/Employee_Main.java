public class Employee_Main {
    public static void main(String[] args) {

        Employee myEmployee = new Employee(9.8);
        Manager1 myManager = new Manager1(10.7);

        System.out.println(myEmployee.getSalary());
        myEmployee.work();
        System.out.println(myManager.getSalary());
        myManager.work();
        myManager.holdManager();



    }
}
