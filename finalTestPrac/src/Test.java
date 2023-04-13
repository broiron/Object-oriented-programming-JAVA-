public class Test {
    public static void main(String[] args) {
        ShapeTag s1 = new ShapeTag("shape1");
        System.out.println("----------------------------");
        System.out.println("Shape1 Tag: " + s1);
        System.out.println("----------------------------");

        ShapeTag s2 = new ShapeTag("shape2");
        System.out.println("Shape2 Tag: " + s2);
        System.out.println("----------------------------");

        RectangleTag r = new RectangleTag("shape", "rectangle");

    }
}