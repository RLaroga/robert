package FACTORY_DESIGN_PATTERN.SHAPE;

public class RectangleShape implements MethodShape {
    @Override
    public void draw() {
        System.out.println("This is a Rectangle");
    }
}
