import javax.swing.*;
import java.awt.*;

public class ToolPanel {
    private JPanel panel;

    public ToolPanel() {
        // create ToolPanel container and set layout
        // THIS FRAME NEEDS TO BE RETURNED TO APP FRAME
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.CYAN);
    }

    public JPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new ToolPanel();
    }

}
