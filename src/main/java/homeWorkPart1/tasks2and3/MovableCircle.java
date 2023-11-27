package homeWorkPart1.tasks2and3;

public class MovableCircle implements Movable {

    private MovablePoint point;
    private double radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, double radius) {
        this.point = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        point.moveUp();
    }

    @Override
    public void moveDown() {
        point.moveDown();
    }

    @Override
    public void moveLeft() {
        point.moveLeft();
    }

    @Override
    public void moveRight() {
        point.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle with center " + point + ". Radius= " + radius;
    }
}
