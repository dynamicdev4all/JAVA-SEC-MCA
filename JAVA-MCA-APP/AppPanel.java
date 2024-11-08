import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AppPanel extends JPanel {
    BufferedImage bgImage;
    Timer timer;
    int x = 0;
    int y = 100;

    AppPanel() {
        setSize(500, 500);
        loadBgImage();
        appLoop();
        setFocusable(true);
    }

    void loadBgImage() {
        try {
            bgImage = ImageIO.read(AppPanel.class.getResource("car.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void appLoop() {
        timer = new Timer(30, (abc) -> {
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        // TODO Auto-generated method stub
        pen.drawImage(bgImage, x, y, 120, 120, null);
    }
}
