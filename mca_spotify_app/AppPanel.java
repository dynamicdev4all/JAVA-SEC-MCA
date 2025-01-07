import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;

public class AppPanel extends JPanel {
    Timer timer;
    JButton playPauseButton;
    JButton previousButton;
    JButton nextButton;
    ArrayList<SongModel> list = SongClient.convertSongs("https://itunes.apple.com/search?term=arijit+singh&limit=25");
    int currentSongIndex = 0;
    BufferedImage songImage;

    AppPanel() {
        setLayout(null);
        setSize(500, 500);
        playPauseButton = new JButton("Play/Pause");
        previousButton = new JButton("Previous");
        nextButton = new JButton("Next");
        // songName = new JLabel("DEMO");
        // song
        playPauseButton.setBounds(50, 400, 100, 50);
        nextButton.setBounds(200, 400, 100, 50);
        previousButton.setBounds(350, 400, 100, 50);
        // add(songName);
        // add(singerName);
        add(previousButton);
        add(playPauseButton);
        add(nextButton);
        loadImage(list.get(currentSongIndex)._songImage);
        appLoop();
        buttonControls();
        setFocusable(true);
    }

    void appLoop() {
        timer = new Timer(80, (abc) -> {
            repaint();
        });
        timer.start();
    }

    void loadImage(String path) {
        try {
            songImage = ImageIO.read(new URL(path));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void buttonControls() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongIndex++;
                loadImage(list.get(currentSongIndex)._songImage);
            }
        });
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentSongIndex--;
                loadImage(list.get(currentSongIndex)._songImage);
            }
        });
    }

    void showText(Graphics pen, String data, int xPos, int yPos) {
        pen.drawString(data, xPos, yPos);
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        pen.drawImage(songImage, 150, 60, 200, 200, null);
        pen.setFont(new Font("Raleway", Font.BOLD, 20));
        pen.setColor(Color.BLACK);
        showText(pen, list.get(currentSongIndex)._songName, 105, 300);
        showText(pen, list.get(currentSongIndex)._singerName, 105, 330);

    }
}
