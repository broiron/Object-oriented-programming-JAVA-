import java.awt.Point;

class Circle implements Shape, comparable {

    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public int compareTo(Object O) {
        Circle c = (Circle) O;
        if(c.getRadius() == this.getRadius()) return 0;
        else if (c.getRadius() > this.getRadius()) return -1;
        else return 1;
    }

    @Override
    public double area() { return Math.PI*(this.getRadius() * this.getRadius()); }

    @Override
    public double perimeter() { return 2 * Math.PI * this.getRadius(); }

    @Override
    public void translate(int x, int y) {
        Point p = new Point((int) getCenter().getX() + x, (int) getCenter().getY() + y);
        setCenter(p);
    }

    @Override
    public boolean contains(double x, double y) {
        double dist = Math.abs(this.center.getX() - x) + Math.abs(this.center.getY() - y);
        if (dist < this.radius) {
            return true;
        }
        else return false;
    }

    @Override
    public boolean intersects(Object c) {
        Circle c_ = (Circle) c;
        double distPts = Math.sqrt(((this.getCenter().getX() - c_.getCenter().getX()) * (this.getCenter().getX() - c_.getCenter().getX())) +
                ((this.getCenter().getY() - c_.getCenter().getY()) * (this.getCenter().getY() - c_.getCenter().getY())));
        double sumR = c_.getRadius() + this.getRadius();
        if (distPts > sumR) {
            return false;
        }
        else return true;
    }

    @Override
    public String toString() {
        return "(" + Double.toString(this.getCenter().getX()) + "," + Double.toString(this.getCenter().getY()) + ")"
                + " ~ p: " + Double.toString(this.perimeter());
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


}