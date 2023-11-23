package skillo.oop.employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivelin", "Tapalilov", 2000);
        employee.getAnnualSalary();
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseTheSalary(30));
        System.out.println(employee);
    }
}
