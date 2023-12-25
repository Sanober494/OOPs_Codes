//This code is used to add or subract two numbers and show the output

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class abc extends JFrame {
   JTextField t1, t2;
   JButton b, b1;
   JLabel l;

   abc() {
      t1 = new JTextField(10);
      t2 = new JTextField(10);
      b = new JButton("Add");
      b1 = new JButton("Sub");

      l = new JLabel("Result");
      add(t1);
      add(t2);
      add(b);
      add(b1);
      add(l);
      ;
      b.addActionListener(al);
      b1.addActionListener(nl);

      setLayout(new FlowLayout());

      setVisible(true);
      setSize(500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   ActionListener nl = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         int n1 = Integer.parseInt(t1.getText());
         int n2 = Integer.parseInt(t2.getText());
         int val = n1 - n2;
         l.setText(val + "");
      }

   };
   ActionListener al = new ActionListener() {
      public void actionPerformed(ActionEvent a) {

         int n1 = Integer.parseInt(t1.getText());
         int n2 = Integer.parseInt(t2.getText());
         int val = n1 + n2;
         l.setText(val + "");
      }
   };

}

class Add_Sub {

   public static void main(String args[]) {

      abc obj = new abc();

   }
}
