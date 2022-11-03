import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String firstNumber, secondNumber;
        String message = "You're just entered: ";
        String title = "Two Numbers";

        firstNumber = JOptionPane.showInputDialog(null, "Please enter first number: ", title,
                JOptionPane.INFORMATION_MESSAGE);
        message += firstNumber + " and ";

        secondNumber = JOptionPane.showInputDialog(null, "Please enter second number: ", title,
                JOptionPane.INFORMATION_MESSAGE);

        message += secondNumber;
        int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        message += "\n" + "The sum is: " + sum;
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
