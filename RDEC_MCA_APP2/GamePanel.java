import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
    BufferedImage dancerImage;
    ImageIcon dancerImage2;
    Timer timer;
    int x = 0;
    int y = 0;
    Car car1;
    Car car2;
    Car car3;

    GamePanel() {
        setSize(600, 600);
        // setBackground(Color.GREEN);
        // loadImage();
        car1 = new Car(20, 350, 100, 200, 2);
        car2 = new Car(170, 350, 100, 200, 30);
        car3 = new Car(320, 350, 100, 200, 8);
        gameLoop();
    }

    @Override
    protected void paintComponent(Graphics brush) {
        // TODO Auto-generated method stub
        super.paintComponent(brush);
        car1.paintCar(brush);
        car2.paintCar(brush);
        car3.paintCar(brush);

    }

    void gameLoop() {
        timer = new Timer(50, (a) -> {
            // if (x > 600 || y > 600) {
            //     x = 0;
            //     y = 0;
            // }
            // x = x + 15;
            // y = y + 15;
            car1.moveCarBBottomToTop();
            car2.moveCarBBottomToTop();
            car3.moveCarBBottomToTop();
            repaint();
        });
        timer.start();
    }
}
