import java.awt.Shape;

public class MyShape {
    private Shape shape;
    private boolean filled;

    public MyShape(Shape shape, boolean filled) {
        this.shape = shape;
        this.filled = filled;
    }

    public Shape getShape() {
        return shape;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
