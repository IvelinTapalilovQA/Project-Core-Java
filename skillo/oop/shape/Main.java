package skillo.oop.shape;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();

        System.out.println(circle.getArea(7));
        System.out.println(circle.getPerimeter(7));

        System.out.println(square.getArea(10));
        System.out.println(square.getPerimeter(10));

    }
}
