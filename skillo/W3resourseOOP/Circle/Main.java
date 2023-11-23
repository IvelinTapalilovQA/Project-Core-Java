package skillo.W3resourseOOP.Circle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);

        System.out.println("The circumference of the circle is " + circle.getCircumference());
        System.out.println("The area of the circle is " + circle.getArea());

        //Changing the radius
        circle.setRadius(7);
        System.out.println("The new radius is " + circle.getRadius());

        System.out.println("The circumference of the circle is now " + circle.getCircumference());
        System.out.println("The area of the circle is now " + circle.getArea());
    }
}
