import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AppPanel extends JPanel {
    BufferedImage bgImage;
    int xAxis = 100;
    int yAxis = 100;
    Timer timer;

    AppPanel() {
        setSize(500, 500);
        // setBackground(Color.BLUE);
        loadBgImage();
        callPaintAgain();
    }

    void loadBgImage() {
        try {
            bgImage = ImageIO.read(AppPanel.class.getResource("car.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void callPaintAgain() {
        timer = new Timer(50, (a) -> {
            // if (xAxis > 500) {
            //     xAxis = 0;
            // }
            xAxis = xAxis + 10;
            yAxis = yAxis + 10;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics brush) {
        super.paintComponent(brush);
        brush.drawImage(bgImage, xAxis, yAxis, 80, 120, null);
    }
}
