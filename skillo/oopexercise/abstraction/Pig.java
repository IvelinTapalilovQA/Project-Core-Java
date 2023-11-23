package skillo.oopexercise.abstraction;

public class Pig extends Animal{

    @Override
    public void animalSound() {
        System.out.println("The pig makes a sound: gruh gruh");
    }

    @Override
    public void move() {
        System.out.println("The pig is moving with four legs");
    }
}
