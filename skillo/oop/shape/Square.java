package skillo.oop.shape;

public class Square extends Shape {


    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public double getPerimeter(double side) {
        return 4 * side;
    }
}
