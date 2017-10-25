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

    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }

    private int getParts() {
        return parts;
    }

    private String getNameOfOpening() {
        return nameOfOpening;
    }

    private String getMadeOf() {
        return madeOf;
    }

    public void printDimensions(){
        System.out.println("Width: "+this.getWidth()+", Height: " +this.getHeight()+ " and Made of: " + this.getMadeOf());
    }
}
