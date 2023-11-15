package DesignPattern.Factory.SHAPE.service.impl;

import DesignPattern.Factory.SHAPE.service.MethodShape;

public class CircleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
