package homeWorkPart1.task1;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("blue", true);

        System.out.println(shape1);
        System.out.println(shape2);

        shape1.setColor("green");
        shape1.setShouldFillShape(false);
        System.out.println(shape1);

        Circle circle1 = new Circle();
        Circle circle2 = new Circle("black", true, 2.15);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Area= " + decimalFormat.format(circle2.getArea()));
        System.out.println("Perimeter= " + decimalFormat.format(circle2.getPerimeter()));

        System.out.println(circle1);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle("yellow", true, 2.15, 3.1);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println("Area= " + decimalFormat.format(rectangle2.getArea()));
        System.out.println("Perimeter= " + decimalFormat.format(rectangle2.getPerimeter()));

        Square square1 = new Square();
        Square square2 = new Square("yellow", true, 4.5);

        System.out.println(square1);
        System.out.println(square2);
        System.out.println("Area= " + decimalFormat.format(square2.getArea()));
        System.out.println("Perimeter= " + decimalFormat.format(square2.getPerimeter()));
    }
}
