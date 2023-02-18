import cache.BundledShapeCache;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        List<Shape> copies = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        shapes.add(circle);

        Circle otherCircle = (Circle) circle.getClone();
        shapes.add(otherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, copies);

    }

    public static void cloneAndCompare(List<Shape> shapes, List<Shape> copies) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }


        if (shape2 != shape3) {
            if (shape2.equals(shape3)) {
                System.out.println("The objects are identical, but they are not in the same memory spot. They are copies!");
            } else {
                System.out.println("The objects are different!");
            }
        } else {
            System.out.println("The objects are in the same memory spot. They are no copies, they are both te same object!");
        }

    }
}