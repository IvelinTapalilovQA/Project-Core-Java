package progress.oop.shape;

public class Circle implements Shape{

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * radius;
    }
}
