import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        Object[] options = { "Yes, I do", "No, I don't" };
        int option = JOptionPane.showOptionDialog(null, "Do you want to change?", "Option",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null, "You chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"),
                "Option", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}