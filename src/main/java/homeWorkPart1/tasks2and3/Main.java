package homeWorkPart1.tasks2and3;

public class Main {

    public static void main(String[] args) {

        Movable point = new MovablePoint(2, 3, 1, 1);
        point.moveUp();
        System.out.println(point);

        Movable circle = new MovableCircle(2, 3, 1, 2, 3.5);
        circle.moveRight();
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);
    }
}
