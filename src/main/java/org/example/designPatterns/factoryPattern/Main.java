package org.example.designPatterns.factoryPattern;

import org.example.designPatterns.factoryPattern.Shape.IShape;
import org.example.designPatterns.factoryPattern.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape circle = shapeFactory.getShape("circle");
        circle.shapeDetails();

        IShape triangle = shapeFactory.getShape("triangle");
        triangle.shapeDetails();

        IShape square = shapeFactory.getShape("square");
        square.shapeDetails();
    }
}
