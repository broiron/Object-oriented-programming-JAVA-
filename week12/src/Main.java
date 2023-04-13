import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Block1 b = new Block1(new Point(10, 10));
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20),
                                    new Point(70, 70));

        Block2 b2 = new Block2(new Point(20, 20));
        Block3 b3 = new Block3(new Point(30, 30));

        System.out.println("r");
        System.out.println(r);
        System.out.println("r2");
        System.out.println(r2);

        System.out.println("b");
        System.out.println(b);
        b.translate(10, -10);
        System.out.println("b");
        System.out.println(b);

        System.out.println("b2");
        System.out.println(b2);
        b2.translate(-10, 10);
        System.out.println("b2");
        System.out.println(b2);

        System.out.println("b3");
        System.out.println(b3);
        b3.translate(20, -10);
        System.out.println("b3");
        System.out.println(b3);
    }
}