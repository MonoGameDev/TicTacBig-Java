import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseEvent;

public class Window extends JFrame {
    public Window(String title, GraphicsConfiguration gc) {
        super();

        setSize(1600, 900);

        setVisible(true);
        
        addMouseListener(new MainMouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getPoint().toString());
            }
        });
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        MyGraphics mG = new MyGraphics(g2D, this);
        mG.clearScreen(Colors.white);
        drawGrid(mG);
    }

    private void drawGrid(MyGraphics g) {
        int gridSize = 100;
        for (int y = 0; y < 100; y++) {
                g.drawLine(Colors.black, 0, y * gridSize, 1600, y * gridSize);
        }
        for (int x = 0; x < 100; x++) {
                g.drawLine(Colors.black, x * gridSize, 0 , x * gridSize, 900);
        }
    }
}
