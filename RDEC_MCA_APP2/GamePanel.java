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
    int coinIndex = 0;
    Coins c = new Coins();
    BufferedImage coinImages[] = c.getCoinImages();
    int carCount = 15;
    Car cars[] = new Car[carCount];
    String carNames[] = { "car.gif", "car2.png", "car3.png" };
    // Car car1;
    // Car car2;
    // Car car3;
    // Car car4;

    GamePanel() {
        setSize(600, 600);
        // setBackground(Color.GREEN);
        // loadImage();
        initCars();
        // car1 = new Car(20, 350, 100, 200, 2);
        // car2 = new Car(170, 350, 100, 200, 30);
        // car3 = new Car(320, 350, 100, 200, 8);
        gameLoop();
    }

    void initCars() {
        // cars[0]=new Car(20, 350, 100, 200, 2);
        int gap = 30;
        int nameLen = carNames.length;
        for (int i = 0; i < carCount; i++) {
            cars[i] = new Car(gap, 350, 210, 200, 2, carNames[i % nameLen]);
            gap = gap + 100 + 50;
        }
    }

    @Override
    protected void paintComponent(Graphics brush) {
        // TODO Auto-generated method stub
        super.paintComponent(brush);
        // car1.paintCar(brush);
        // car2.paintCar(brush);
        // car3.paintCar(brush);
        // showCars(brush);
        showCoins(brush);

    }

    // void showCars(Graphics brush) {
    // for (int i = 0; i < carCount; i++) {
    // cars[i].paintCar(brush);
    // }
    // }

    void showCoins(Graphics brush) {
        c.paintCoin(brush, coinImages[coinIndex]);
        System.out.println(coinIndex);
    }

    void gameLoop() {
        timer = new Timer(300, (a) -> {
            // if (x > 600 || y > 600) {
            // x = 0;
            // y = 0;
            // }
            // x = x + 15;
            // y = y + 15;
            // car1.moveCarBBottomToTop();
            // car2.moveCarBBottomToTop();
            // car3.moveCarBBottomToTop();
            // moveCars();
            repaint();
            if(coinIndex==coinImages.length -1){
                coinIndex = -1;
            }
            coinIndex++;
        });
        timer.start();
    }

    void moveCars() {
        for (int i = 0; i < carCount; i++) {
            cars[i].moveCarBBottomToTop();
        }
    }
}
