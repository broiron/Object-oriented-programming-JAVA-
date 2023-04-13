class SelectableRectangle extends Rectangle {
    protected Point p1;
    protected boolean isSelected;
    public SelectableRectangle(Point p, double w, double h) {
        super(w, h);
        p1 = p;
        isSelected = false;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
    public boolean isInside(Point p) {
        int x = p.getX(); int y = p.getY(); int x1 = p1.getX(); int y1 = p1.getY();
        if((x1<=x && x <=x1+width) && (y1<=y && y<=y1 + height))
            return true;
        return false;
    }
}

public class TestSelection {
    public static void main (String[] args) {
        Point p = new Point(2, 3);
        SelectableRectangle s1 = new SelectableRectangle(p, 10, 10);
        Point mouse = new Point(5, 10);
        System.out.printf("Point %s is inside? Answer: %d", mouse, s1.isInside(mouse));
    }
}