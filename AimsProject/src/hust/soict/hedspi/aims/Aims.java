package src.hust.soict.hedspi.aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.Book;
import src.hust.soict.hedspi.aims.media.CompactDisc;
import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import src.hust.soict.hedspi.aims.media.Media;
import src.hust.soict.hedspi.aims.media.Track;
import src.hust.soict.hedspi.aims.store.Store;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("---------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        Store store = new Store();
        data(store);
        showMenu();
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1: {
                viewStore(store);
            }
            case 2: {

            }
            case 3: {

            }
            case 0: {
                System.out.println("Exit!!!!!");
                break;
            }
            default:
                break;
        }
    }

    private static void data(Store store) {
        store.addMedia(new DigitalVideoDisc("The Lion king", "Animation", "A. Pepter", 120, 20.0f));
        Book book1 = new Book("This book title", "Scifi", 15.6f);
        book1.addAuthor("Betty");
        book1.addAuthor("Betty's daughter");
        Book book2 = new Book("Harry Potter", "Adventure", 27.3f);
        book2.addAuthor("JK.Rowling");
        Book book3 = new Book("The Hobbit", "Adventure", 21.6f);
        book3.addAuthor("JR.Tolkien");
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(new DigitalVideoDisc("The Avengers", "Hero", "Tom Holand", 134, 24.0f));
        CompactDisc d1 = new CompactDisc("Midnight", "Pop", 12.4f, "Taylor", "Taylor Swift");
        d1.addTrack(new Track("Midnight rain", 20));
        d1.addTrack(new Track("Snow on the beach", 15));
        CompactDisc d2 = new CompactDisc("Folkerlore", "Rock", 11.4f, "Brave", "Blake");
        d2.addTrack(new Track("Stay", 12));
        d2.addTrack(new Track("Move on", 11));
        store.addMedia(d1);
        store.addMedia(d2);
    }

    private static void viewStore(Store store) {
        store.printStore();
        storeMenu();
    }

}