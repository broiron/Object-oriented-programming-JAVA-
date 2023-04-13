class Turtle {
    private int limbs = 4;
    protected String food;

    public int getLimbs() {
        return this.limbs;
    }

}

class SeaTurtle extends Turtle {
    public void swim() {System.out.println("A sea Turtle swim");}
    public void printLimbs() { System.out.println("limbs: "+getLimbs());}
}

class LandTurtle extends Turtle {
    public void walk() {System.out.println("A Land Turtle walks");}
    public void printLimbs(){ System.out.println("limbs: "+getLimbs());}
}

public class TestTurtle {
    public static void main(String[] args) {
        SeaTurtle s1 = new SeaTurtle();
        LandTurtle L1 = new LandTurtle();
        s1.printLimbs(); L1.printLimbs();
        s1.swim(); L1.walk();
    }
}