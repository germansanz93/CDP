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
        for (Shape shape : shapes) {
            copies.add(shape.getClone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            Shape copy = copies.get(i);

            if (shape != copy) {
                if (shape.equals(copy)){
                    System.out.println(i + "- The objects are identical, but they are not in the same memory spot. They are copies!");
                } else {
                    System.out.println(i + "- The objects are different!");
                }
            } else {
                System.out.println(i + "- The objects are in the same memory spot. They are no copies, they are both te same object!");
            }
        }
    }
}