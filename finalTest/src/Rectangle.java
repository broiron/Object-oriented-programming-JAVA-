import java.awt.Point;
class Rectangle implements Shape, comparable {

    private Point UL;
    private Point DR;
    private double width;
    private double height;

    public Rectangle(Point UL, Point DR) {
        this.UL = UL;
        this.DR = DR;
        this.width = Math.abs(DR.getX() - UL.getX());
        this.height = Math.abs(DR.getY() - UL.getY());
    }

    public Point getDR() {
        return DR;
    }

    public Point getUL() {
        return UL;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setDR(Point DR) {
        this.DR = DR;
    }

    public void setUL(Point UL) {
        this.UL = UL;
    }
    @Override
    public int compareTo(Object O) {
        Rectangle rec = (Rectangle) O;
        if(rec.perimeter() == this.perimeter()) return 0;
        else if (rec.perimeter() > this.perimeter()) return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return "(" + Double.toString(this.getUL().getX()) + "," + Double.toString(this.getUL().getY()) + ")" +  "(" +
                Double.toString(this.getDR().getX()) + "," +Double.toString(this.getDR().getY()) + ")" + " p: " + Double.toString(this.perimeter());
    }

    @Override
    public boolean intersects(Object o) {
        Rectangle rec = (Rectangle) o;
        if(rec.getDR().getX() < this.getUL().getX() || this.getDR().getX() < rec.getUL().getX()) {
            return false;
        }
        else if(rec.getDR().getY() > this.getUL().getY() || this.getDR().getY() > rec.getUL().getY()) {
            return false;
        }
        else return true;
    }
    @Override
    public boolean contains(double x, double y) {
        if ((this.getUL().getX() < x && this.getDR().getX() > x) && (this.getUL().getY() < y && this.getDR().getY() > y)) {
            return true;
        }
        else return false;
    }
    @Override
    public double area() {
        return this.getWidth() * this.getHeight();
    }
    @Override
    public double perimeter() {
        return this.getWidth() * 2 + this.getHeight() * 2;
    }
    @Override
    public void translate(int x, int y) {
        Point UL_ = new Point((int) this.getUL().getX() + x, (int) this.getUL().getY() + y);
        setUL(UL_);
        Point DR_ = new Point((int) this.getDR().getX() + x, (int) this.getDR().getY() + y);
        setDR(DR_);
    }
}