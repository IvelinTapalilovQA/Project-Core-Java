package progress.oop.student;

public class Main {

    public static void main(String[] args) {
     
        Student studentOne = new Student("Ivan Ivanov", 23);

        studentOne.addExam("Math", 5);
        studentOne.addExam("Science", 4);
        studentOne.addExam("History", 6);

        System.out.println(studentOne.getName());
        studentOne.getExams().forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println(studentOne.getName() + "'s average grade is: ");
        System.out.println(studentOne.getAverageGrade());

    }
}
