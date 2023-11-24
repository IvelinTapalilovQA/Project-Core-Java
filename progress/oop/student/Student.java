package progress.oop.student;

import java.util.Collection;
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
        int size = 0;
        if(!exams.isEmpty()){
            Collection<Double> grades = exams.values();
            size = grades.size();
            for(Double grade : grades){
                averageGrade += grade;
            }
        }
        return (averageGrade /= size );
    }
}
