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
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(0x536878)); // Set background color to #607d8b

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

        // Add brush size buttons
        JButton smallBrushButton = new JButton("Small Brush");
        JButton mediumBrushButton = new JButton("Medium Brush");
        JButton largeBrushButton = new JButton("Large Brush");

        smallBrushButton.addActionListener(e -> drawingCanvas.setBrushSize(2));
        mediumBrushButton.addActionListener(e -> drawingCanvas.setBrushSize(5));
        largeBrushButton.addActionListener(e -> drawingCanvas.setBrushSize(15));

        panel.add(smallBrushButton);
        panel.add(mediumBrushButton);
        panel.add(largeBrushButton);

        // Add color chooser dialog box button
        JButton colorChooserButton = new JButton("Choose Color");
        panel.add(colorChooserButton);

        // Logic for color chooser
        colorChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color selectedColor = JColorChooser.showDialog(panel, "Choose Brush Color", drawingCanvas.getBrushColor());
                if (selectedColor != null) {
                    drawingCanvas.setBrushColor(selectedColor);
                }
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
