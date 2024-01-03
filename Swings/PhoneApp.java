import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Radio extends JFrame {
   JButton[] btnNumbers;
   JButton btnCall;
   JButton btnClear;
   JTextField tfDisplay;
   String strPhoneNumber = "";
   boolean isCalling = false;

   Radio() {
      // Set up the top display panel
      JPanel pnlDisplay = new JPanel();
      add(pnlDisplay, BorderLayout.NORTH);

      // Set up the display text field
      tfDisplay = new JTextField(30);

      tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
      pnlDisplay.add(tfDisplay);

      // Set up the center button panel
      JPanel pnlButtons = new JPanel(new GridLayout(4, 3));
      add(pnlButtons);

      // Set up a common listener for all number buttons
      MyNumberButtonListener lis = new MyNumberButtonListener();

      // Allocate the JButton array for number buttons
      btnNumbers = new JButton[10];
      // Allocate each of the item (JButton) of the array
      for (int i = 0; i < btnNumbers.length; ++i) {
         btnNumbers[i] = new JButton(i + "");
         // Add the common listener to each of the JButton
         btnNumbers[i].addActionListener(lis);
      }

      // Add the JButtons in the right order
      for (int i = 1; i <= 9; ++i) {
         pnlButtons.add(btnNumbers[i]);
      }

      btnClear = new JButton("CLEAR");
      pnlButtons.add(btnClear);
      btnClear.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            strPhoneNumber = "";
            tfDisplay.setText(strPhoneNumber);
         }
      });

      pnlButtons.add(btnNumbers[0]);

      btnCall = new JButton("CALL");
      pnlButtons.add(btnCall);

      btnCall.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            if (isCalling) {
               isCalling = false;
               btnCall.setText("CALL");

            } else {
               isCalling = true;
               btnCall.setText("HANG UP");

            }
         }
      });

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);
      setTitle("Phone App");
      setVisible(true);
   }

   class MyNumberButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         strPhoneNumber += e.getActionCommand();
         tfDisplay.setText(strPhoneNumber);
      }
   }

}

class PhoneApp{
   public static void main(String[] args) {
      Radio r = new Radio();
   }
}
