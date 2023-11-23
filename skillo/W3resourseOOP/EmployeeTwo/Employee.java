package skillo.W3resourseOOP.EmployeeTwo;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private int salaryPerYear;
    private LocalDate hireDate;


    public Employee(String name, int salaryPerYear, LocalDate hireDate) {
        this.name = name;
        this.salaryPerYear = salaryPerYear;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salaryPerYear;
    }

    public void setSalary(int salaryPerYear) {
        this.salaryPerYear = salaryPerYear;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getYearsOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails(){
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("Salary per year " + salaryPerYear);
        System.out.println("Hire date: " + hireDate);
    }
}
