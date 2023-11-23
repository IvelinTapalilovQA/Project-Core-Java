package skillo.W3resourseOOP.EmployeeTwo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Employee employeeOne = new Employee("Ivan Ivanov", 30000, LocalDate.parse("2014-04-21"));
        Employee employeeTwo = new Employee("Dragan Draganov", 45000, LocalDate.parse("2017-07-28"));
        Employee employeeThree = new Employee("Zdravko Zdravkov", 60000, LocalDate.parse("2020-10-30"));

        employeeOne.printEmployeeDetails();
        employeeTwo.printEmployeeDetails();
        employeeThree.printEmployeeDetails();

        System.out.println("Years of service of " + employeeOne.getName() + " are " + employeeOne.getYearsOfService() + " years");
        System.out.println("Years of service of " + employeeTwo.getName() + " are " + employeeTwo.getYearsOfService() + " years");
        System.out.println("Years of service of " + employeeThree.getName() + " are " + employeeThree.getYearsOfService() + " years");
    }
}
