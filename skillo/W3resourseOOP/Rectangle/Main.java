package skillo.W3resourseOOP.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangleOne = new Rectangle(6, 7);

        System.out.println("The area of the rectangle is " + rectangleOne.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangleOne.getPerimeter());

        //Changing the width and the height
        rectangleOne.setWidth(10.3);
        rectangleOne.setHeight(12.5);

        System.out.println("The area of the rectangle is now " + rectangleOne.getArea());
        System.out.println("The perimeter of the NEW rectangle is now " + rectangleOne.getPerimeter());
    }
}
