import javax.swing.*;
import java.awt.*;

public class DrawApp {
    public DrawApp() {
        // create frame
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout()); // Change the layout manager to BorderLayout
        frame.setBackground(new Color(0x263238));

        // set initial frame specifications
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DrawPad");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // create DrawingCanvas and add to panel
        DrawingCanvas drawingCanvas = new DrawingCanvas();
        drawingCanvas.setBackground(Color.white);
        frame.add(drawingCanvas, BorderLayout.CENTER);

        // create ToolPanel and add to panel
        ToolPanel toolPanel = new ToolPanel(drawingCanvas);
        frame.add(toolPanel.getPanel(), BorderLayout.WEST);

        // make sure all components appear on program start
        frame.revalidate();

    }

    public static void main(String[] args) {
        new DrawApp();
    }
}