public interface Shape {
    public boolean contains(double x, double y);
    public boolean intersects(Object o);
    public double area();
    public double perimeter();
    public void translate(int x, int y);
}

interface comparable {
    public int compareTo(Object O);
}