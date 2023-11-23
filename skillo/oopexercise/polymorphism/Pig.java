package skillo.oopexercise.polymorphism;

public class Pig extends Animal{

    @Override
    protected void AnimalSound() {
        System.out.println("The pig makes a sound: gruh gruh");
    }
}
