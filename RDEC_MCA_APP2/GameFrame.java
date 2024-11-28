import javax.swing.JFrame;

public class GameFrame {
    private JFrame frame = new JFrame();

    GameFrame() {
        frame.setTitle("MCA APP 2");
        frame.setSize(600, 600);
        GamePanel gPanel = new GamePanel();
        frame.add(gPanel);
        frame.setVisible(true);
    }

}