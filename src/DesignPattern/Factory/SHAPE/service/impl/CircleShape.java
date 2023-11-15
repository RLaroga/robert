package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.SHAPE.service.impl;

import DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.SHAPE.service.MethodShape;

public class CircleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
