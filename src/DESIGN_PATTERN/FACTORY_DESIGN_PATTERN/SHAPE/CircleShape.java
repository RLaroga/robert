package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.SHAPE;

public class CircleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a circle");
    }
}
