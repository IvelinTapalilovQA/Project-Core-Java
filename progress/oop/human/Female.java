package progress.oop.human;

public class Female extends Human {

    public Female(String name, int age) {
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

