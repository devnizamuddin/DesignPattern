package factory.shape;

import factory.shape.component.ShapeFactory;
import factory.shape.model.Shape;

public class Main {

    /**
     * The Factory pattern provides an interface for creating objects
     * without specifying the exact class of the object that will be created.
     * It encapsulates the object creation logic
     *
     * In case of Mobile App Development
     * It is commonly used for rendering view as their type.
     * Or using feature as device.
     */

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
