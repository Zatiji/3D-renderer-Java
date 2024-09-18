import java.awt.Color;

// A triangle is composed by three Points and has a color

public class Triangle {
    
    private Point p1;
    private Point p2;
    private Point p3;
    private Color color;

    Triangle (Point p1, Point p2, Point p3, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.color = color;

    }
}
