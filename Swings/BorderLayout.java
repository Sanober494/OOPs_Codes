
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Radio extends JFrame {
    JButton b1, b2, b3, b4, b5;

    Radio() {
        b1 = new JButton("I'm up here:)");
        b2 = new JButton("I'm down here:(");
        b3 = new JButton("I am the center of attention~~~");
        b4 = new JButton("I am just lying here");
        b5 = new JButton("Chillin here cuz why not?");
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.CENTER);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.EAST);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class BorderLayout {
    public static void main(String args[]) {

        Radio r = new Radio();

    }

}
