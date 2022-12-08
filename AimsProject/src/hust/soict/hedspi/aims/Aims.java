package src.hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;

import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.Book;
import src.hust.soict.hedspi.aims.media.CompactDisc;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import src.hust.soict.hedspi.aims.media.Media;
import src.hust.soict.hedspi.aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        List<Media> items = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Harry Potter", "Scifi", 19.95f);
        book.addAuthor("J.K Rowling");
        book.addAuthor("J.K Rowling's daughter");
        CompactDisc cpDvd = new CompactDisc("Folkloer", "Pop", 19.95f, null, "Taylor Swift");
        cpDvd.addTrack(new Track("Evermore", 10));
        cpDvd.addTrack(new Track("Snow on the beach", 10));
        cpDvd.addTrack(new Track("Midnight rain", 10));
        cpDvd.addTrack(new Track("Evermore", 10));

        items.add(book);
        items.add(dvd);
        items.add(cpDvd);

        for (Media item : items) {
            anOrder.addMedia(item);
        }

        anOrder.prinCast();
    }
}