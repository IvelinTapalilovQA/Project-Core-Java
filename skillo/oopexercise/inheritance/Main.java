package skillo.oopexercise.inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Ford", "Mustang", 2.67, 2.05, 2300, 2, 330, 2);

        car.closeOpenDoor();
        car.closeOpenDoor();
        car.honk();
    }
}
