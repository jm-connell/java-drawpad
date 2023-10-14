import javax.swing.*;

public class ColorChooser {

    private JColorChooser colorChooser;

    public ColorChooser() {
        colorChooser = new JColorChooser();
    }

    public JColorChooser getColorChooser() {
        return colorChooser;
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}

