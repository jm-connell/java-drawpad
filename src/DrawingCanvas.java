import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingCanvas extends JPanel {
    private int lastX, lastY;

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
    private void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(Color.BLACK);
        g.drawLine(lastX, lastY, x, y);
        lastX = x;
        lastY = y;
        g.dispose();
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
