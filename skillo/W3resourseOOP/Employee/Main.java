package skillo.W3resourseOOP.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employeeOne = new Employee("Ivan Ivanov", "Accountant", 2000);
        Employee employeeTwo = new Employee("Dragan Petkov", "Restaurant manager", 3000);

        employeeOne.raiseSalary(20);
        System.out.println("employeeOne salary after raise with 20% is " + employeeOne.getSalaryPerMonth() + " and the annual salary now is " + employeeOne.calculateAnnualSalary());

        employeeTwo.raiseSalary(25);
        System.out.println("employeeTwo salary after raise with 25% is " + employeeTwo.getSalaryPerMonth() + " and the annual salary now is " + employeeTwo.calculateAnnualSalary());

        employeeOne.printEmployeeDetails();
        employeeTwo.printEmployeeDetails();
    }
}
