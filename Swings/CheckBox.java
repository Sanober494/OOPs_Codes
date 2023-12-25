
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Radio extends JFrame {
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;
    JCheckBox c1, c2, c3;

    Radio() {

        t1 = new JTextField(15);

        r1 = new JRadioButton("Female");
        r2 = new JRadioButton("Male");
        b = new JButton("OK");
        l = new JLabel("Good Morning");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");
        c3 = new JCheckBox("Painting");
        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        /*
        event on checkbox can also be added, the code would be the following:
        c2.addItemListner(new ItemListner(){
        public void itemStateChanged(ItemEvent e){System.out.println("Singer");}
        })
        */
        add(c3);
        add(b);
        add(l);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                if (r1.isSelected()) {
                    name = "Miss " + name + " is";
                } else {
                    name = "Mr. " + name + " is";
                }
                if (c1.isSelected()) {
                    name = name + " Dancer!";
                }
                if (c2.isSelected()) {
                    name = name + " Singer!";
                }
                if (c3.isSelected()) {
                    name = name + " Painter!";
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

public class CheckBox {
    public static void main(String args[]) {

        Radio r = new Radio();

    }

}
