import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.management.ImmutableDescriptor;
import javax.swing.ImageIcon;

public class Car {
    int x;
    int y;
    int w;
    int h;
    int speed;
    BufferedImage carImage;
    String fileName;
    // BufferedImage leftRunImages[] = new BufferedImage[8];
    // BufferedImage rightRunImages[] = new BufferedImage[8];

    // ImageIcon carImage;

    Car(int x, int y, int w, int h, int speed, String fileName) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.speed = speed;
        this.fileName = fileName;
        loadImage();
        // leftRunImages[0] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(0, 0,
        // 82, 106);
        // leftRunImages[1] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(82, 0,
        // 82, 106);
        // leftRunImages[2] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(0, 0,
        // 82, 106);
        // leftRunImages[0] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(0, 0,
        // 82, 106);
        // leftRunImages[0] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(0, 0,
        // 82, 106);
        // leftRunImages[0] =
        // ImageIO.read(GamePanel.class.getResource("running.jpg")).getSubimage(0, 0,
        // 82, 106);
    }

    void loadImage() {

        // carImage = new ImageIcon(GamePanel.class.getResource("dancer.gif"));

        try {
            carImage = ImageIO.read(GamePanel.class.getResource(fileName));
            // carImage =
            // ImageIO.read(GamePanel.class.getResource(fileName)).getSubimage(164, 106, 82,
            // 106);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    void paintCar(Graphics brush) {
        brush.drawImage(carImage, x, y, w, h, null);
    }

    void moveUp() {
        y = y - speed;
    }

    void moveDown() {
        y = y + speed;
    }

    void moveLeft() {
        x = x - speed;
    }

    void moveRight() {
        x = x + speed;
    }

    void jump(int h) {
        y = y - h;
    }
}
