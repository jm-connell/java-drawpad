import javax.swing.*;
import java.awt.*;

public class DrawApp {
    public DrawApp() {
        // create frame
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout()); // Change the layout manager to BorderLayout

        // set initial frame specifications
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DrawPad");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // create DrawingCanvas
        DrawingCanvas drawingCanvas = new DrawingCanvas();
        drawingCanvas.setBackground(Color.white);

        // Create canvas wrapper for padding, add to frame
        JPanel canvasWrapper = new JPanel();
        canvasWrapper.setLayout(new BorderLayout());
        canvasWrapper.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        canvasWrapper.add(drawingCanvas);
        canvasWrapper.setBackground(new Color(0x263238));
        frame.add(canvasWrapper, BorderLayout.CENTER);

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