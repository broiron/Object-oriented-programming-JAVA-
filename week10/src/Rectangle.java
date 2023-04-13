
public class Rectangle {
    private double height;
    private double width;
    private double area;

    public Rectangle(double h, double w) {
        this.height = h;
        this.width = w;
        calcArea();
    }

    public double getHeight() { return this.height; }
    public double getWidth() { return this.width; }
    public void setHeight(double h) { this.height = h; calcArea(); }
    public void setWidth(double w) { this.width = w; calcArea();}
    public void calcArea() { this.area = this.height * this.width; }
    public double getArea() { return this.area; }

}