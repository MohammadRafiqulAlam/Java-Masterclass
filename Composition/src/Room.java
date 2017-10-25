public class Room {
    private Surface surface1; // side walls
    private Surface surface2;  // front walls
    private Surface surface3; // roof and floor
    private Furniture furniture;

    public Room(Surface surface1, Surface surface2, Surface surface3, Furniture furniture) {
        this.surface1 = surface1;
        this.surface2 = surface2;
        this.surface3 = surface3;
        this.furniture = furniture;
    }

    public Surface getSurface1() {
        return surface1;
    }

    public Surface getSurface2() {
        return surface2;
    }

    public Surface getSurface3() {
        return surface3;
    }

    public Furniture getFurniture() {
        return furniture;
    }
}
