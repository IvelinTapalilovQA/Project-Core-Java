package skillo.W3resourseOOP.Student;

public class Main {

    public static void main(String[] args) {

        Student studentOne = new Student("Ivan Ivanov", 6);
        Student studentTwo = new Student("Dragan Draganov", 5);

        studentOne.addCourses("Marketing");
        studentOne.addCourses("Data Science");
        studentTwo.addCourses("English");
        studentTwo.addCourses("Math");


        studentOne.printStudentDetails();
        System.out.println(studentOne.getName() + "'s courses :" + studentOne.getCourses());

        studentTwo.printStudentDetails();
        System.out.println(studentTwo.getName() + "'s courses :" + studentTwo.getCourses());

        studentOne.removeCourses("Marketing");
        System.out.println("\nRemove course Marketing");
        System.out.println(studentOne.getName() + "'s courses :" + studentOne.getCourses());
    }
}
