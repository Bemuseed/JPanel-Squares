import javax.swing.*;
import java.awt.*;

public class SquarePanel extends JPanel {
    private Color color;

    public SquarePanel(Color color) {
        this.color = color;
        setPreferredSize(new Dimension(50, 50)); // Adjust the size as needed
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
