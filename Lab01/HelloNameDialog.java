import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hi " + name + "!", "Hello App", 1);
        System.exit(0);
    }

}
