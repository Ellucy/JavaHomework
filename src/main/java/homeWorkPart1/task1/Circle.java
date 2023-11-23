package homeWorkPart1.task1;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String color, boolean shouldFillShape, double radius) {
        super(color, shouldFillShape);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius= " + radius + " is a subclass of " + Shape.class.getSimpleName() + ". " + super.toString();
    }
}
