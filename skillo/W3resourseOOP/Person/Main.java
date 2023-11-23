package skillo.W3resourseOOP.Person;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("Ean Craig", 11);
        Person personTwo = new Person("Evan Ross", 12);
        System.out.println(personOne.getName() + " is " + personOne.getAge() + " years old.");
        System.out.println(personTwo.getName() + " is " + personTwo.getAge() + " years old.");

        personOne.setAge(14);
        personTwo.setName("Levis Jordan");
        personTwo.setAge(13);
    }
}
