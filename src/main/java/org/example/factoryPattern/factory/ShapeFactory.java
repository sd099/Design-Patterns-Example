package org.example.factoryPattern.factory;

import org.example.factoryPattern.Shape.Circle;
import org.example.factoryPattern.Shape.IShape;
import org.example.factoryPattern.Shape.Square;
import org.example.factoryPattern.Shape.Triangle;

public class ShapeFactory {
    public IShape getShape(String type) {
        if (type.equals("triangle")) {
            return new Triangle();
        } else if (type.equals("circle")) {
            return new Circle();
        } else {
            return new Square();
        }
    }
}
