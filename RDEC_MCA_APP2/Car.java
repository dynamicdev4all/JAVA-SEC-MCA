import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Car {
    int x;
    int y;
    int w;
    int h;
    int speed;
    BufferedImage carImage;

    Car(int x, int y, int w, int h, int speed) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.speed = speed;
        loadImage();
    }

    void loadImage() {

        try {
            carImage = ImageIO.read(GamePanel.class.getResource("car.gif"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void paintCar(Graphics brush) {
        brush.drawImage(carImage, x, y, w, h, null);
    }

    void moveCarBBottomToTop() {
        y = y - speed;
    }
}
