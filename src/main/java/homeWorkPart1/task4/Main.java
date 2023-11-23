package homeWorkPart1.task4;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String line = new String(new char[60]).replace('\0', '-');

        Circle myCircle = new Circle(5);

        System.out.println(decimalFormat.format(myCircle.getArea()));
        System.out.println(decimalFormat.format(myCircle.getPerimeter()));

        System.out.println(line);
        ResizableCircle myResizableCircle = new ResizableCircle(6);

        System.out.println(decimalFormat.format(myResizableCircle.getArea()));
        System.out.println(decimalFormat.format(myResizableCircle.getPerimeter()));

        System.out.println(line);
        myResizableCircle.resize(20);
        System.out.println(decimalFormat.format(myResizableCircle.getRadius()));
        System.out.println(decimalFormat.format(myResizableCircle.getPerimeter()));
    }
}
