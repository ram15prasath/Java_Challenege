public class Point {
    // 1. Private instance variables
    private int x;
    private int y;

    // 2. Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 3. Public getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // 4. Method to calculate distance from origin
    public double distanceFromOrigin() {
        // Use Math.pow() for squares and Math.sqrt() for the square root
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static void main(String[] args) {
        // 5. Create a Point object with coordinates (3, 4)
        Point p = new Point(3, 4);

        // 6. Call the distanceFromOrigin() method and print the result
        double distance = p.distanceFromOrigin();
        System.out.println("The distance of the point (" + p.getX() + ", " + p.getY() + ") from the origin is: " + distance);
    }
}