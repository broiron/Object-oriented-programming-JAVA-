public class Point {
    private int x, y;
    public Point() { }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() { return this.x; }
    public int getY() { return this.y; }
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}