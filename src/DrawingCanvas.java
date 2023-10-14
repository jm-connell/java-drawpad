import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingCanvas extends JPanel {
    private int lastX, lastY;
    private int brushSize = 5;

    public DrawingCanvas() {
        addMouseMotionListener(new MouseAdapter() {
            /*
                mouseDragged()
                    > Follow mouse movement when dragged
                      and send coordinates to draw() function
             */
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                draw(x, y);
            }
        });

        addMouseListener(new MouseAdapter() {
            /*
                mousePressed()
                    > Reset mouse coordinates on each new mouse click
             */
            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });

    }

    /*
        DrawingCanvas Methods
     */
    public void setBrushSize(int size) {
        brushSize = size;
    }
    private void draw(int x, int y) {
        Graphics g = getGraphics();
        Graphics2D g2d = (Graphics2D) g; // Cast to Graphics2D
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(brushSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(lastX, lastY, x, y);
        lastX = x;
        lastY = y;
        g2d.dispose();
    }

    public void clearCanvas() {
        setBackground(Color.white);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
