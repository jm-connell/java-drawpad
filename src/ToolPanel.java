import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolPanel {
    private JPanel panel;
    private DrawingCanvas drawingCanvas;

    public ToolPanel(DrawingCanvas drawingCanvas) {
        // Create ToolPanel container and set layout
        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(new Color(0xcfd8dc)); // Set background color to #607d8b


        /*
            Create tools and add to ToolPanel
         */

        // Add color chooser
        /* ColorChooser colorPicker = new ColorChooser();
           panel.add(colorPicker.getColorChooser()); */

        // Add erase button
        JButton eraseButton = new JButton("Erase Canvas");
        panel.add(eraseButton);

        // Logic for erase button
        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear the DrawingCanvas
                drawingCanvas.clearCanvas();
            }
        });

    }


    public JPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        new ToolPanel(new DrawingCanvas());
    }

}
