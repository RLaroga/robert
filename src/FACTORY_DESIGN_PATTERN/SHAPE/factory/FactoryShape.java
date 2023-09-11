package FACTORY_DESIGN_PATTERN.SHAPE.factory;

import FACTORY_DESIGN_PATTERN.SHAPE.service.MethodShape;
import FACTORY_DESIGN_PATTERN.SHAPE.service.impl.CircleShape;
import FACTORY_DESIGN_PATTERN.SHAPE.service.impl.RectangleShape;

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
