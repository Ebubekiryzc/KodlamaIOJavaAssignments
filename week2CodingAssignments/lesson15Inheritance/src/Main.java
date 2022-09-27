public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.id = 1;
        employee.id = 2;

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add();
        employeeManager.list();
        employeeManager.bestEmployee();
    }
}
