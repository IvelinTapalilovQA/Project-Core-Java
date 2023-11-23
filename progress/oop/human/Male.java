package progress.oop.human;

import progress.oop.human.Human;

public class Male extends Human {

    public Male(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        System.out.println("Walking......");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping....ZzzZz....");
    }

    @Override
    public void talk() {
        System.out.println("Hello my name is " + getName());
    }
}
