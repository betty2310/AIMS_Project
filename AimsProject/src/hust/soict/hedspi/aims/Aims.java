package src.hust.soict.hedspi.aims;

import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "HMMMMM", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", null, 0, 18.99f);
        anOrder.addMedia(dvd3);
        anOrder.prinCast();
    }
}