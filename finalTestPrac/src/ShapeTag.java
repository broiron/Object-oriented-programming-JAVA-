public class ShapeTag {
    private String tag;

    public ShapeTag(String tag) { this.tag = tag;}

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "#" + this.tag;
    }
}