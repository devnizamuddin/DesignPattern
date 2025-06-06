package factory.shape.component;

import factory.shape.*;
import factory.shape.model.Circle;
import factory.shape.model.Rectangle;
import factory.shape.model.Shape;
import factory.shape.model.Square;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {

        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
