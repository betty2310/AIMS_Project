package src.hust.soict.hedspi.aims.store;

import java.util.Vector;

import src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    private Vector<DigitalVideoDisc> itemsInStore = new Vector<DigitalVideoDisc>();

    public Store() {

    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.add(dvd)) {
            System.out.println("The disc has been added to Store!");
        } else {
            System.out.println("The disc is almost full!");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (itemsInStore.remove(dvd)) {
            System.out.println("The disc has been removed from Store!");
        } else {
            System.out.println("The disc is not in the store!");
        }
    }

}
