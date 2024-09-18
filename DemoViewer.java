import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class DemoViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        // slider to control horizontal rotation
        JSlider horizontalSlider = new JSlider(0, 360, 180);
        pane.add(horizontalSlider, BorderLayout.SOUTH);

        // slider to control vertical rotation
        JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
        pane.add(pitchSlider, BorderLayout.EAST);

        // panel to display render results
        JPanel renderPanel = new JPanel() {

            @Override
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.BLACK);
                g2.fillRect(0,0, getWidth(), getHeight());

                // ---------------------------------------------------------------------------------------------------------------------------------- 
                
                // Create a list to store the triangles to make a tetrahedron
                List<Triangle> triangles = new ArrayList<>();

                // we add the triangles in the list
                triangles.add(new Triangle(new Point(100, 100, 100),
                                           new Point(-100, -100, 100),
                                           new Point(-100, 100, 100),
                                           Color.WHITE));
                
                triangles.add(new Triangle(new Point(100, 100, 100),
                                           new Point(-100, -100, 100),
                                           new Point(100, -100, -100),
                                           Color.RED));
                
                triangles.add(new Triangle(new Point(100, 100, 100),
                                           new Point(-100, -100, 100),
                                           new Point(-100, 100, 100),
                                           Color.GREEN));

                triangles.add(new Triangle(new Point(100, 100, 100),
                                           new Point(-100, -100, 100),
                                           new Point(-100, 100, 100),
                                           Color.BLUE));

                // we center the origin point (0, 0, 0)
                g2.translate(getHeight(), getWidth());
                g2.setColor(Color.WHITE);

                // on instancie un objet qui nous permet de tracer des formes géométriques
                for (Triangle t : triangles) {
                    Path2D path = new Path2D.Double();
                    path.moveTo(t.getP1().getX(), t.getP1().getY());
                    path.lineTo(t.getP2().getX(), t.getP2().getY());
                    path.lineTo(t.getP3().getX(), t.getP3().getY());
                    path.closePath();
                    g2.draw(path);
                }

            }
        };
        pane.add(renderPanel, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        
    }
}