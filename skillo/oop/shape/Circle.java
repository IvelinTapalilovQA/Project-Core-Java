package skillo.oop.shape;

public class Circle extends Shape {


    @Override
    double getArea(double radius) {
        return  Math.PI *(radius * radius);
    }

    @Override
    double getPerimeter(double radius) {
        return 2 * Math.PI * radius  ;
    }
}
