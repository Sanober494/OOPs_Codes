
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame {
    JPanel p;
    JButton b;

    Radio() {
        p = new JPanel();
        p.setBackground(Color.red);
        p.setBounds(50, 20, 50, 20);

        b = new JButton("OK");
        p.add(b);
        b.setBackground(Color.red);
        add(p);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class JPanel {
    public static void main(String args[]) {

        Radio r = new Radio();

    }

}
