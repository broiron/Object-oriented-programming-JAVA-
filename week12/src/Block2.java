import java.awt.Point;

public class Block2 {
    private Rectangle[] rectangles;

    public Block2(Point p) {
        rectangles = new Rectangle[4];
        Rectangle rec1 = new Rectangle(p);
        rectangles[0] = rec1;

        Rectangle rec2 = new Rectangle(p);
        rec2.translate(0, Rectangle.getHEIGHT());
        rectangles[1] = rec2;

        Rectangle rec3 = new Rectangle(p);
        rec3.translate(0, 2*Rectangle.getHEIGHT());
        rectangles[2] = rec3;


        Rectangle rec4 = new Rectangle(p);
        rec4.translate(0, 3*Rectangle.getHEIGHT());
        rectangles[3] = rec4;
    }
    public Block2(int x, int y) {
        rectangles = new Rectangle[4];
        Point p = new Point(x, y);

        Rectangle rec1 = new Rectangle(p);
        rectangles[0] = rec1;

        Rectangle rec2 = new Rectangle(p);
        rec2.translate(0, Rectangle.getHEIGHT());
        rectangles[1] = rec2;

        Rectangle rec3 = new Rectangle(p);
        rec3.translate(0, 2*Rectangle.getHEIGHT());
        rectangles[2] = rec3;


        Rectangle rec4 = new Rectangle(p);
        rec4.translate(0, 3*Rectangle.getHEIGHT());
        rectangles[3] = rec4;
    }

    public void translate(int x, int y) {
        for (int i=0; i<rectangles.length; i++) {
            rectangles[i].translate(x, y);
        }
    }
    public String toString() {
        String s="";
        for (int i=0; i<rectangles.length-1; i++) {
            s += rectangles[i].toString() + "\n";
        }
        s += rectangles[rectangles.length-1].toString();
        return s;
    }
}