public class Point {
    private int x;
    private int y;
    private int z;
    public Point() {
        x = 0;
        y = 0;
        z = 0;
    }
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    public float findDistance() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public float findDistance(int x1, int y1, int z1) {
        return (float) Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1) + (z - z1) * (z - z1));
    }

    public float findDistance(Point other) {
        return (float) Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y) + (z - other.z) * (z - other.z));
    }

    public boolean isEqual(Point other) {
        return (x == other.x && y == other.y && z == other.z);
    }

    public void show() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}
