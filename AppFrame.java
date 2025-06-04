import javax.swing.JFrame;

public class AppFrame extends JFrame{
    AppFrame(){
        setTitle("MCA UNIT 5");
        setSize(1200, 800);
        AppPanel panel = new AppPanel();
        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
