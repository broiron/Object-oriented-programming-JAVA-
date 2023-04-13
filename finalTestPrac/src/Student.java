public class Student {
    private int id;
    private String name;
    private String attend;
    private int score;

    public Student(int id, String name, String attend, int score) {
        this.id = id;
        this.name = name;
        this.attend = attend;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    

    @Override
    public String toString() {
        return Integer.toString(this.id) + " " + this.name;
    }
}