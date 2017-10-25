public class Opening {
    private int width;
    private int height;
    private int parts;
    private String nameOfOpening;
    private String madeOf;

    public Opening(int width, int height, int parts, String nameOfOpening, String madeOf) {
        this.width = width;
        this.height = height;
        this.parts = parts;
        this.nameOfOpening = nameOfOpening;
        this.madeOf = madeOf;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getParts() {
        return parts;
    }

    public String getNameOfOpening() {
        return nameOfOpening;
    }

    public String getMadeOf() {
        return madeOf;
    }
}
