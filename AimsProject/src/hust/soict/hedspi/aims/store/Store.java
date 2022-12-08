package src.hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.FlavorException;

import src.hust.soict.hedspi.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store() {

    }

    public boolean addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("The media is already exist");
            return false;
        }
        itemsInStore.add(media);
        return true;
    }

    public boolean removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            return true;
        }
        System.out.println("The media is not exist");
        return false;
    }

    public void printStore() {
        System.out.println("Store");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
    }

    public Media searchStore(String st) {
        for (Media media : itemsInStore) {
            if (media.isMatch(st)) {
                return media;
            }
        }
        return null;
    }
}