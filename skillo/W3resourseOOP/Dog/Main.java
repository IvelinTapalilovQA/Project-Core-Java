package skillo.W3resourseOOP.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dogOne = new Dog("Sharo", "Malinois");
        Dog dogTwo = new Dog("Rocky", "Chihuahua");

        System.out.println(dogOne.getName() + " is a " + dogOne.getBreed());
        System.out.println(dogTwo.getName() + " is a " + dogTwo.getBreed());

        System.out.println("\nSet the new name and breed of dogOne and new name of dogTwo:");
        dogOne.setName("Riko");
        dogOne.setBreed("Dogo Canario");
        dogTwo.setName("Raq");

        System.out.println(dogOne.getName() + " is " + dogOne.getBreed());
        System.out.println(dogTwo.getName() + " is " + dogTwo.getBreed());
    }
}
