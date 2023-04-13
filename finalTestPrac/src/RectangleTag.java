public class RectangleTag extends ShapeTag {
    private String rectangleTag;

    public RectangleTag(String tag, String rectangleTag) {
        super(tag);
        this.rectangleTag = rectangleTag;
    }

    public String getRectangleTag() {
        return rectangleTag;
    }

    @Override
    public String toString() {
        return "#" + this.rectangleTag + " " + super.toString();
    }
}