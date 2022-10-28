package Employee;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Isuru", 7000);
        System.out.println("Name: "+employee1.getName());
        System.out.println("Salary: "+employee1.getSalary());


        System.out.println("............................");
        Employee employee2 = new Employee();
        System.out.println("Name: "+employee2.getName());
        System.out.println("Salary: "+employee2.getSalary());
    }
}
