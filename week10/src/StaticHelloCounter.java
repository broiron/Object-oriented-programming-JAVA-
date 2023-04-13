public class StaticHelloCounter {
    private String name;
    private static int counter = 0;

    StaticHelloCounter(String name) {
        this.name = name;
        counter++;
    }
    void sayHello() { System.out.println("hello "+name); }
    int getCounter() { return this.counter; }
}

public class TestStaticHelloCounter {
    public static void main (String[] args) {
        StaticHelloCounter c1 = new StaticHelloCounter("name1");
        StaticHelloCounter c2 = new StaticHelloCounter("name2");

    }
}