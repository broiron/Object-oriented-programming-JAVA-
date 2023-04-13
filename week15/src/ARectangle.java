public class ARectangle extends AbstractShape {

    private double w, h;
    public ARectangle(double _w, double _h) {
        this.w = _w;
        this.h = _h;
    }
    public double getArea() { return this.w * this.h; }
    public double getPerimeter() { return 2*this.w + 2*this.h; }
}