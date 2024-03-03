package org.example.designPatterns.factoryPattern.factory;

import org.example.designPatterns.factoryPattern.Shape.Square;
import org.example.designPatterns.factoryPattern.Shape.Circle;
import org.example.designPatterns.factoryPattern.Shape.IShape;
import org.example.designPatterns.factoryPattern.Shape.Triangle;

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
