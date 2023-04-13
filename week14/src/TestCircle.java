class Circle extends Point {
    private double radius;
    public Circle() { }
    public Circle(int x, int y, double r) {
        super(x, y);
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getCircuference() {
        return 2 * Math.PI * this.radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2, 3, 3);
        System.out.printf("Radius: %.2f, Area: %.2f, Circuference: %.2f\n", c1.getRadius(), c1.getArea(), c1.getCircuference());
    }
}