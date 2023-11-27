package progress.oop.student;

import java.util.HashMap;

public class Student {

    private String name;
    private int age;
    private HashMap<String, Double> exams;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.exams = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addExam(String exam, double grade){
        exams.put(exam, grade);
    }

    public HashMap<String, Double> getExams() {
        return exams;
    }

    public Double getAverageGrade() {
        Double averageGrade = 0.0;
        if(!exams.isEmpty()){
            for(Double grade : exams.values()){
                averageGrade += grade;
            }
        }
        return (averageGrade /= exams.size() );
    }
}
