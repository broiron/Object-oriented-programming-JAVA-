public class Student {
    private String name;
    private int number;
    private double GPA;

    Student(String name, int number, double GPA) {
        this.name = name;
        this.number = number;
        this.GPA = GPA;
    }

    String getName() { return this.name; }
    int getNumber() { return this.number; }
    double getGPA() { return this.GPA; }

    public String toString() {
        String s = "Name: " + this.name + ", Number: " + this.number + ", GPA: " + this.GPA;
        return s;
    }
}