import javax.swing.*;
import java.awt.*;

class Radio extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JPanel p = new JPanel();

    Radio() {
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        add(p);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class BoxLayout {
    public static void main(String args[]) {
        Radio r = new Radio();
    }
}
