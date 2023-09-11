package FACTORY_DESIGN_PATTERN.SHAPE.service.impl;

import FACTORY_DESIGN_PATTERN.SHAPE.service.MethodShape;

public class RectangleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
