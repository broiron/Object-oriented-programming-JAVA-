public class ShapeAreaMain {
    public static void main(String[] args) {
        AbstractShape[] shapes = new AbstractShape[2];
        shapes[0] = new ARectangle(100, 90);
        shapes[1] = new ACircle(50);

        for (AbstractShape shap: shapes) {
            if(shape instanceof ARectangle) {
                ARectangle ar = (ARectangle) shape;
                ar.getArea();
            }
            else if(shape instanceof ACircle) {
                Acircle ac = (Acircle) shape;
                ac.getArea();
            }
        }
        for (AbstractShape shap: shapes) {
            shapes.getArea();
        }

    }
}