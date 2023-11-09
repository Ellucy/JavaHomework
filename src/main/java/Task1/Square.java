package Task1;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String color, boolean shouldFillShape, double side) {
        super(color, shouldFillShape, side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}