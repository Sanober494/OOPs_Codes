
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame {
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;

    Radio() {

        t1 = new JTextField(15);

        r1 = new JRadioButton("Female");
        r2 = new JRadioButton("Male");
        b = new JButton("OK");
        l = new JLabel("Good Morning");
        add(t1);
        
        add(r1);
        add(r2);
        add(b);
        add(l);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                if (r1.isSelected()) {
                    name = "Miss " + name;
                } else {
                    name = "Mr. " + name;
                }
                l.setText(name);
            }
        });

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class newpgm {
    public static void main(String args[]) {

        Radio r = new Radio();

    }

}
