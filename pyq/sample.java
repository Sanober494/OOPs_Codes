import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Radio extends JFrame {
   JPanel p, p1;
   JMenu m1, m2;
   JMenuBar mb;
   JMenuItem i1, i2;
   JLabel l;
   JTextField tf;
   JButton b1, b2;

   Radio() {
      setTitle("Chat Frame");
      JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JMenuBar mb = new JMenuBar();
      JMenu m1 = new JMenu("File");
      JMenu m2 = new JMenu("Help");
      JMenuItem i1 = new JMenuItem("Open");
      JMenuItem i2 = new JMenuItem("Save as");
      m1.add(i1);
      m1.add(i2);
      mb.add(m1);
      mb.add(m2);
      p1.add(mb);

      add(p1);
      JPanel p = new JPanel();
      JLabel l = new JLabel("Enter Text:");
      JTextField tf = new JTextField(20);
      JButton b1 = new JButton("Send");
      JButton b2 = new JButton("Reset");
      p.add(l);
      p.add(tf);
      p.add(b1);
      p.add(b2);
      add(p, BorderLayout.SOUTH);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);

      setVisible(true);
   }

}

class sample {
   public static void main(String[] args) {
      Radio r = new Radio();
   }
}
