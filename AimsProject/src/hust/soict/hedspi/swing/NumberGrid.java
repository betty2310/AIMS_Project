package src.hust.soict.hedspi.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btNumbers = new JButton[10];
    private JButton btDelete, btReset;
    private JTextField tfDisplay;

    public NumberGrid() {
        tfDisplay =  new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        tfDisplay.setSize(300, 100);
        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        addButtons(panelButtons);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGrid();
    }

    void addButtons(JPanel panelButtons) {
        ButtonListener buttonListener = new ButtonListener();
        for(int i = 1;i <= 9; ++i) {
            btNumbers[i] = new JButton("" + i);
            panelButtons.add(btNumbers[i]);
            btNumbers[i].addActionListener(buttonListener);
        }
        btDelete = new JButton("DEL");
        btDelete.addActionListener(buttonListener);
        panelButtons.add(btDelete);
        btNumbers[0] = new JButton("0");
        btNumbers[0].addActionListener(buttonListener);
        panelButtons.add(btNumbers[0]);
        btReset = new JButton("C");
        btReset.addActionListener(buttonListener);
        panelButtons.add(btReset);
    }
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if(button.charAt(0) >= '0' && button.charAt(0) <= '9') {
                tfDisplay.setText(tfDisplay.getText() + button);
            } else if(button.equals("DEL")) {
                String str = tfDisplay.getText();
                tfDisplay.setText(str.substring(0, str.length() - 1));
            } else {
                tfDisplay.setText("");
            }
        }
    }
}
