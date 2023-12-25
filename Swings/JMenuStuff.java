
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame {
    JMenuBar mb;
    JMenu m, sm, sm1;
    JMenuItem i3, i4, i5, i6;

    Radio() {
        mb = new JMenuBar();
        m = new JMenu("Fruits");// Not a fan of fruits but okiee (typing this while eating an apple)
        sm = new JMenu("Red Fruits");
        sm1 = new JMenu("Yellow Fruits");

        i3 = new JMenuItem("Apple");
        i4 = new JMenuItem("Pomegrante");
        i5 = new JMenuItem("Mango");
        i6 = new JMenuItem("Banana");
        sm.add(i3);
        sm.add(i4);
        m.add(sm);
        sm1.add(i5);
        sm1.add(i6);
        m.add(sm1);
        mb.add(m);
        add(mb);

        setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class JMenuStuff {
    public static void main(String args[]) {

        Radio r = new Radio();

    }

}
