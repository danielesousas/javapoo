public class Rectangle {

    private final double width;
    private final double hight;
    private double square;

    public Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
        square = width * hight;
    }

    public Rectangle(double width) {
        this(width, width);
    }

    public double square() {
        return square;
    }
}
