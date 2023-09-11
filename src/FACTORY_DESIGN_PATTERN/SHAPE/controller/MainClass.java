package FACTORY_DESIGN_PATTERN.SHAPE.controller;

import FACTORY_DESIGN_PATTERN.SHAPE.factory.FactoryShape;
import FACTORY_DESIGN_PATTERN.SHAPE.service.MethodShape;

import java.util.Objects;

public class MainClass {
    public static void main(String [] args) {

        /** --------------------------------------------------------------------------------
         * Create an instance of shape factory for the creation of object in different Shapes
         *  --------------------------------------------------------------------------------
         */
        FactoryShape shapeFactory = new FactoryShape();

        /** --------------------------------------------------------------------------------
         * Get an instance of circle using the createShape method of a shapeFactory class
         *  --------------------------------------------------------------------------------
         */
        MethodShape circleShape = shapeFactory.createShape("Circle");
        if (Objects.nonNull(circleShape)) {
            circleShape.draw();
        }

        /** --------------------------------------------------------------------------------
         * Get an instance of rectangle using the createShape method of a class shapeFactory
         *  --------------------------------------------------------------------------------
         */
        MethodShape rectangleShape = shapeFactory.createShape("Rectangle");
        if (Objects.nonNull(rectangleShape)) {
            rectangleShape.draw();
        }

        /** --------------------------------------------------------------------------------
         * Get an instance of diamond using the createShape method of a class shapeFactory
         * but diamond shape is not included of the creation of shape in shapeFactory
         * that causes to make the Shape diamond as null
         *  --------------------------------------------------------------------------------
         */
        MethodShape diamondShape = shapeFactory.createShape("Diamond");
        if (Objects.nonNull(diamondShape)) {
            diamondShape.draw();
        } else {
            System.out.println("Diamond is null");
        }

    }
}
