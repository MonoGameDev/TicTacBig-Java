import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;

public class MyGraphics {
    Graphics2D g;
    double windowWidth;
    double windowHeight;
    double frameWidth;
    double frameHeight;
    Insets insets;

    MyGraphics(Graphics2D g, JFrame window){
        this.g = g;
        this.insets = window.getInsets();
        this.windowWidth = window.getSize().getWidth();
        this.windowHeight = window.getSize().getHeight();
        this.frameWidth = windowWidth - insets.left - insets.right;
        this.frameHeight = windowHeight - insets.top - insets.bottom;
        window.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                window.repaint();
            }
        });
    }

    void drawLine(Color color, int x1, int y1, int x2, int y2) {
        g.setColor(color);
        x1 = (int)(x1 / 1600.0 * frameWidth) + insets.left;
        y1 = (int)(y1 / 900.0 * frameHeight) + insets.top;
        x2 = (int)(x2 / 1600.0 * frameWidth) + insets.left;
        y2 = (int)(y2 / 900.0 * frameHeight) + insets.top;

        g.drawLine(x1, y1, x2, y2);
    }

    void clearScreen(Color color) {
        g.setColor(color);
        g.fillRect(0, 0, (int)windowWidth, (int)windowHeight);
    }
}
