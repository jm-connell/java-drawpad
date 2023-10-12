import javax.swing.*;
import java.awt.*;

public class DrawApp {
    public DrawApp() {
        // create frame and panel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout()); // Change the layout manager to BorderLayout

        // set initial frame size
        frame.setSize(800, 600);

        // add panel to frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DrawPad");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // instantiate child containers and add to panel
        ToolPanel toolPanel = new ToolPanel();
        panel.add(toolPanel.getPanel(), BorderLayout.WEST);

    }

    public static void main(String[] args) {
        new DrawApp();
    }
}