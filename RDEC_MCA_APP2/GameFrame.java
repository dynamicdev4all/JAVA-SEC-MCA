import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        setTitle("MCA APP 2");
        setSize(600, 600);
        GamePanel gPanel = new GamePanel();
        add(gPanel);
        setVisible(true);
    }

}