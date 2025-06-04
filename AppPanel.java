import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AppPanel extends JPanel {
    AppPanel(){
        setSize(1200, 800);
        setBackground(Color.red);
        JTextField tf = new JTextField(40);
        add(tf);
        JTextArea ta = new JTextArea(1, 40);
        add(ta);
        JButton btn = new JButton("MCA");
        add(btn);
        JCheckBox jcb = new JCheckBox("TnC");
        add(jcb);
        JRadioButton R1 = new JRadioButton("male");
        JRadioButton R2 = new JRadioButton("Female");
        ButtonGroup grp = new ButtonGroup();
        grp.add(R1);
        grp.add(R2);
        add(R2);
        add(R1);
        String arr [] = {"JAN", "FEB","MAR","APR"};
        JList<String> lst = new JList<>(arr);
        add(lst);
    }
}
