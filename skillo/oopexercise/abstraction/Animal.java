package skillo.oopexercise.abstraction;

public abstract class Animal {

    //Abstract method
    public abstract void animalSound();

    public abstract void move();

    public void sleep(){
        System.out.println("Sleeping...Zzzz....");
    }
}
