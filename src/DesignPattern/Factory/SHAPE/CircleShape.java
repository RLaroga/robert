package DesignPattern.Factory.SHAPE;

public class CircleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
