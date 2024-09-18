import java.awt.Color;

// A triangle is composed by three Points and has a color

public class Triangle {
    
    final private Point p1;
    final private Point p2;
    final private Point p3;
    final private Color color;

    public Triangle (Point p1, Point p2, Point p3, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;

    }

    // Class accessors
    
    public Point getP1 () {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public Color getColor() {
        return color;
    }
}
