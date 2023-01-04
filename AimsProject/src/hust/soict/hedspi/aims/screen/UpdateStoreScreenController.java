package src.hust.soict.hedspi.aims.screen;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class UpdateStoreScreenController implements Initializable {
    @FXML
    private ComboBox<String> listMedia = new ComboBox<String>();


    public void btAddPressed(ActionEvent eactionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Added");
        alert.setHeaderText("Add Media");
        alert.setTitle("Add");
        alert.getButtonTypes().setAll(ButtonType.OK);
        alert.showAndWait();
    }

    public void initList() {
        listMedia.getItems().add("CD");
        listMedia.getItems().add("DVD");
        listMedia.getItems().add("BOOK");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initList();
    }
}
