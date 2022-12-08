package src.hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.Book;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import src.hust.soict.hedspi.aims.media.Media;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        List<Media> items = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Harry Potter", "Scifi", 19.95f);
        book.addAuthor("J.K Rowling");
        book.addAuthor("J.K Rowling's daughter");

        items.add(book);
        items.add(dvd);

        for (Media item : items) {
            anOrder.addMedia(item);
        }

        anOrder.prinCast();
    }
}