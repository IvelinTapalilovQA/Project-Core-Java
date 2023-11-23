package progress.oop.human;

public abstract class Human implements Comparable<Human> {

    private String name;
    private int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk() {
        System.out.println("The human walks with two legs!");
    }

    public void talk(){
        System.out.println("The human can talks with his mouth!");
    }


    public abstract void sleep();

    @Override
    public int compareTo(Human another){
        int result = Integer.compare(this.age, another.age);{
        if (result == 0) result =(this.name.compareTo(another.name));
        }
        return result;
    }
}