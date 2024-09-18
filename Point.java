
// The point has 3 coordinates (X, Y, Z)

public class Point {
   
    final private double x;
    final private double y;
    final private double z;

    public Point (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // accessors
    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    public double getZ() {
        return z;
    }
    
}