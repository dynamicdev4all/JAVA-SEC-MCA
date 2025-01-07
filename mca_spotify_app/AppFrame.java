import javax.swing.JFrame;

public class AppFrame extends JFrame {
    AppFrame() {
        setTitle("SPOTIFY APP");
        setSize(500, 500);
        setLocationRelativeTo(null);
        AppPanel appPanel = new AppPanel();
        add(appPanel);
        setVisible(true);
    }
}
