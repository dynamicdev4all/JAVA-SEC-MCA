import java.io.IOException;
import java.nio.Buffer;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.management.ImmutableDescriptor;
import javax.swing.ImageIcon;

public class Coins {
    int x;
    int y;
    int w;
    int h;
    BufferedImage coin;
    BufferedImage[] coins = new BufferedImage[3];

    Coins() {
        loadImage();
    }

    void loadImage() {
        try {
            coin = ImageIO.read(Coins.class.getResource("coins.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BufferedImage[] getCoinImages() {
        coins[0] = coin.getSubimage(23, 41, 33, 41);
        coins[1] = coin.getSubimage(55, 41, 33, 41);
        coins[2] = coin.getSubimage(85, 41, 33, 41);
        return coins;
    }

    void paintCoin(Graphics brush, BufferedImage img ) {
        brush.drawImage(img, 0, 0, 80, 80, null);
    }
}
