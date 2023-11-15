package DesignPattern.Factory.SHAPE.factory;

import DesignPattern.Factory.SHAPE.service.MethodShape;
import DesignPattern.Factory.SHAPE.service.impl.CircleShape;
import DesignPattern.Factory.SHAPE.service.impl.RectangleShape;

public class FactoryShape {

    public MethodShape createShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }

        if(shapeType.equalsIgnoreCase("Circle")) {
            return new CircleShape();
        } else if(shapeType.equalsIgnoreCase("Rectangle")) {
            return new RectangleShape();
        }
        return null;
    }

}
