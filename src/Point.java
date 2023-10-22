public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point target) {
        return Math.round(Math.sqrt(Math.pow((x - target.x), 2) + Math.pow((y - target.y), 2)) * 100.0) / 100.0;
    }
}
