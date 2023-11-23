package skillo.W3resourseOOP.Employee;

public class Employee {

    private String name;
    private String job;
    private int salaryPerMonth;

    public Employee(String name, String job, int salaryPerMonth) {
        this.name = name;
        this.job = job;
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void raiseSalary(int percentage){
        this.salaryPerMonth = salaryPerMonth + (salaryPerMonth *  percentage / 100);
    }

    public int calculateAnnualSalary(){
        return salaryPerMonth * 12;
    }

    public void printEmployeeDetails(){
        System.out.println("\nEmployee details: ");
        System.out.println("Name: " + name);
        System.out.println("Job title: " + job);
        System.out.println("Salary per month: " + salaryPerMonth);
        System.out.println("Annual salary: " + calculateAnnualSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salaryPerMonth +
                '}';
    }
}
