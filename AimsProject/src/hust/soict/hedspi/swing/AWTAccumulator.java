package src.hust.soict.hedspi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame {
   private TextField tfInput;
   private TextField tfOutput;
   private int sum = 0;

   public AWTAccumulator() {
       setLayout(new GridLayout(2, 2));
       add(new Label("Enter an Integer: "));
       tfInput = new TextField(10);
       add(tfInput);
       tfInput.addActionListener(new TFInputListener());

       add(new Label("Sum is: "));

       tfOutput = new TextField(10);
       tfOutput.setEditable(false);
       add(tfOutput);

       setTitle("AWT Accmulator");
       setSize(350, 120);
       setVisible(true);
   }

    public static void main(String[] args) {
        new AWTAccumulator();
    }

   private class TFInputListener implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           int number = Integer.parseInt(tfInput.getText());
           sum+=number;
           tfInput.setText("");
           tfOutput.setText(sum + "");
       }
   }
}
