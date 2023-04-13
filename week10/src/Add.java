
public class Add {

    int add(int a, int b) { return a+b; }
    double add(double d1, double d2) { return d1+d2; }
    String add(String a, String b) { return a+b;}

    public static void main (String[] args) {

        Add a = new Add();

        int sum = a.add(2, 3);
        double sumD = a.add(3.0, 2.0);
        String strSum = a.add("H", "I");

        System.out.printf("IntSum: %d, DoubleSum: %.2f, StringSum: %s\n", sum, sumD, strSum);
    }
}