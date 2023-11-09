package Task4;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double newRadius = getRadius() * (1- (percent / 100.0));
        super.setRadius(newRadius);
    }
}
