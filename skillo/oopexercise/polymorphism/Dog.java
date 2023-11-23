package skillo.oopexercise.polymorphism;

public class Dog extends  Animal{

    @Override
    protected void AnimalSound() {
        System.out.println("The dog makes a sound: bow wow");
    }
}
