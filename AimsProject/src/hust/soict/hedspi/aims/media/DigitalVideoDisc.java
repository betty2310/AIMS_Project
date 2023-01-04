package src.hust.soict.hedspi.aims.media;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.swing.*;
import java.awt.*;

public class DigitalVideoDisc extends Disc implements Playable {

    public DigitalVideoDisc(String string, String string2, String string3, int i, float f) {
        super(string, string2, string3, i, f);
    }

    /**
     * we implement 2 ways to create dialog, with Swing and JavaFX.
     * If involve from StoreSreen means Swing UI, use JavaFX will crash and vice versa
     * So, F**k Java
     */
    public void play() {
        JFrame j = new JFrame();
        String text =  "Playing DVD: " + this.getTitle() + "\nDVD length: " + this.getLength();
        JOptionPane.showMessageDialog(j, text, "Play Media", JOptionPane.INFORMATION_MESSAGE);
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText(text);
//        alert.setHeaderText("Total payment: ");
//        alert.setTitle("Play Media");
//        alert.getButtonTypes().setAll(ButtonType.OK);
//        alert.showAndWait();
    }

    @Override
    public String toString() {
        return "(Digital Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$";
    }

}