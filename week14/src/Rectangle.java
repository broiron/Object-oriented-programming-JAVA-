import java.awt.Point;

public class Rectangle {
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private Point upperLeft;
    private Point lowerRight;

    public Rectangle(Point uL) {
        this.upperLeft = new Point((int) uL.getX(), (int) uL.getY());
        this.lowerRight = new Point((int) this.upperLeft.getX() + WIDTH, (int) this.upperLeft.getY() + HEIGHT);
    }
    public Rectangle(Point uL, Point lR) {
        this.upperLeft = uL;
        this.lowerRight = lR;
    }
    public void translate(int x, int y) {
        this.upperLeft.translate(x, y);
        this.lowerRight.translate(x, y);
    }
    public String toString() {
        String s = "UL: "+this.upperLeft+", LR: "+this.lowerRight;
        return s;
    }
    public static int getWIDTH() { return WIDTH; }
    public static int getHEIGHT() { return HEIGHT; }
}