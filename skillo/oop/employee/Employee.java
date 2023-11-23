package skillo.oop.employee;

import java.util.Random;

public class Employee {
    private String id;
    final private String name;
    final private String surname;
    int salaryPerMonth;

    public Employee(String name, String surname, int salaryPerMonth) {
        this.setId(name, surname);
        this.name = name;
        this.surname = surname;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getId() {
        return id;
    }

    public void setId(String name, String surname) {
        Random randomNumber = new Random();
        this.id = "id-"+ name + surname + randomNumber.nextInt();
    }

    public String getName() {
        return name + " " + surname;
    }


    public int getAnnualSalary() {
        return salaryPerMonth * 12;
    }

    public int raiseTheSalary(int percentage) {
        return salaryPerMonth + (salaryPerMonth *  percentage / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salaryPerMonth=" + salaryPerMonth +
                '}';
    }
}
