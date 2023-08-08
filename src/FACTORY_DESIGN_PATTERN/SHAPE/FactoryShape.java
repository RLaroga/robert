package FACTORY_DESIGN_PATTERN.SHAPE;

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
