package src.hust.soict.hedspi.aims.cart;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import src.hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public boolean addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("The media is already exist");
            return false;
        }
        itemsOrdered.add(media);
        return true;
    }

    public boolean removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            return true;
        }
        System.out.println("The media is not exist");
        return false;
    }

    public float totalCost() {
        float sum = 0.0f;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    public void prinCast() {
        System.out.println("***********************CART***********************\nOrdered Items:");
        for (Media media : itemsOrdered) {
            System.out.println(media.toString());
        }

        System.out.println("Total cost: " + totalCost() + "\n***************************************************");

    }
    public void sortCartByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortCartByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public int getQty() {
        return itemsOrdered.size();
    }

    public void filterByTitle(String st) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(st)) {
                System.out.println(media.toString());
            }
        }
    }

    public Media searchCart(String st) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(st)) {
                return media;
            }
        }
        return null;
    }

    public void newCart() {
        // remove all items in itemsOrderd;
        itemsOrdered.clear();

    }

}
