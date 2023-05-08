package org.example.factoryPattern;

import org.example.factoryPattern.Shape.IShape;
import org.example.factoryPattern.factory.ShapeFactory;

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
