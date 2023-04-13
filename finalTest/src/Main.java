import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new Point(10, 150), new Point(70, -20));
        Rectangle r2 = new Rectangle(new Point(-20, 70), new Point(55, 50));
        Rectangle r3 = new Rectangle(new Point(20, 20), new Point(100, -50));

        Circle c1 = new Circle(10, new Point(20, 20));
        Circle c2 = new Circle(5, new Point(-10, -5));
        Circle c3 = new Circle(5, new Point(10, 15));

        //(1) Solution
        System.out.println("(1) Solution");
        System.out.println("0) " + r1.toString());
        System.out.println("1) " + r2.toString());
        System.out.println("2) " + r3.toString());
        System.out.println("3) " + c1.toString());
        System.out.println("4) " + c2.toString());
        System.out.println("5) " + c3.toString());

        //(2) Solution
        System.out.println("\n(2) Solution");
        r1.translate(5, 10);
        c1.translate(5, 10);
        System.out.println("r1 moved to" + r1.toString());
        System.out.println("c1 moved to" + c1.toString());

        //(3) Solution
        System.out.println("\n(3) Solution");
        System.out.println("Rectangles comparing 190.00 with 460.00");
        System.out.printf("comparing r1, r2 --> %d\n", r1.compareTo(r2));
        System.out.println("Circles comparing 62.83 with 31.42");
        System.out.printf("comparing c1, c2 --> %d\n", c1.compareTo(c2));

        //(4) Solution
        double sum1 = r1.perimeter() + r2.perimeter() + r3.perimeter() + c1.perimeter() + c2.perimeter() + c3.perimeter();
        double sum2 = r1.area() + r2.area() + r3.area() + c1.area() + c2.area() + c3.area();
        System.out.println("\n(4) Solution");
        System.out.println("sum of area: " + sum2);
        System.out.println("sum of perimeter: " + sum1);

        //(5) Solution
        System.out.println("\n(5) Solution");
        Shape[] list = new Shape[6];
        list[0] = r1; list[1] = r2; list[2] = r3; list[3] = c1; list[4] = c2; list[5] = c3;
        for (Shape obj : list) {
            System.out.println(obj.toString() + " contains(30.0, 30.0) --> " + obj.contains(30.0, 30.0));
        }

        //(6) Solution
        System.out.println("\n(6) Solution");
        Circle c4 = new Circle(5, new Point(15, 15));
        Rectangle r4 = new Rectangle(new Point(10, 30), new Point(30, 10));

        for (Shape obj : list) {
            if (obj instanceof Rectangle){
                System.out.println(obj.toString() + " intersects (10,30)(30,10) p:80.0 -->" + obj.intersects(r4));
            }
            else {
                System.out.println(obj.toString() + " intersects" + c4.toString() + "-->" + obj.intersects(c4));

            }
        }


    }
}