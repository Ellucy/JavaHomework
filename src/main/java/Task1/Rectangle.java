package Task1;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(String color, boolean shouldFillShape, double length, double width) {
        super(color, shouldFillShape);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle with width= " + width + " and length= " + length + " is a subclass of " + Shape.class.getSimpleName() + ". " + super.toString();
    }
}