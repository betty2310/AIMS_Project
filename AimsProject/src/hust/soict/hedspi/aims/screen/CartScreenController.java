package src.hust.soict.hedspi.aims.screen;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.Media;
import src.hust.soict.hedspi.aims.media.Playable;

public class CartScreenController {
    private Cart cart;

    @FXML
    private Button btRemove;

    @FXML
    private Button btPlay;

    @FXML
    private TableColumn<Media,  Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private TableView<Media> tblMedia;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    public void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());

        btPlay.setVisible(false);
        btRemove.setVisible(false);

        tblMedia.getSelectionModel().selectedItemProperty().addListener(
                (observableValue, oldValue, newValue) -> {
                   if(newValue != null)  {
                       updateButton(newValue);
                   }
                }
        );
    }

    void updateButton(Media media)  {
        btRemove.setVisible(true);
        if (media instanceof Playable) {
            btPlay.setVisible(true);
        } else {
            btPlay.setVisible(false);
        }
    }

}
