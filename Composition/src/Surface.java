public class Surface {
    private int width;
    private int length;
    private Positioning surfacePositioning;

    public Surface(int width, int length, Positioning surfacePositioning) {
        this.width = width;
        this.length = length;
        this.surfacePositioning = surfacePositioning;
    }

    private int getWidth() {
        System.out.println("Surface width : " + width);
        return width;
    }

    private int getLength() {
        System.out.println("Surface length : " + length);
        return length;
    }

    public void returnDimensions(){
        this.getWidth();
        this.getLength();
    }
    public void surfaceOpening(Opening opening) {
        opening.printDimensions();
    }

}
