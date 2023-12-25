import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame {
    JComboBox jc;
    JButton b;
    JLabel l;

    Radio() {
        l = new JLabel();
        b = new JButton("Show:");
        String languages[] = { "C", "C++", "C#", "Java", "PHP", "Python" };
        jc = new JComboBox(languages);
        add(jc);
        add(b);
        add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String l1 = "Language Selected is: " + jc.getItemAt(jc.getSelectedIndex());
                l.setText(l1);
            }
        });

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class ComboBox {
    public static void main(String args[]) {
        Radio r = new Radio();
    }
}
