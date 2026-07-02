public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(5);

        manager.addEmployee(
                new Employee(
                        101,
                        "Tejasree",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(
                        102,
                        "Rahul",
                        "Tester",
                        40000));

        manager.addEmployee(
                new Employee(
                        103,
                        "Priya",
                        "Analyst",
                        45000));

        manager.displayEmployees();

        manager.searchEmployee(102);

        manager.deleteEmployee(102);

        manager.displayEmployees();
    }
}