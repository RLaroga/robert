package DesignPattern.Factory.SHAPE.service.impl;

import DesignPattern.Factory.SHAPE.service.MethodShape;

public class RectangleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
