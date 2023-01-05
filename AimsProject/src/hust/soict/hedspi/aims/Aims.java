package src.hust.soict.hedspi.aims;

import src.hust.soict.hedspi.aims.cart.Cart;
import src.hust.soict.hedspi.aims.media.*;
import src.hust.soict.hedspi.aims.screen.CartScreen;
import src.hust.soict.hedspi.aims.screen.StoreScreen;
import src.hust.soict.hedspi.aims.store.Store;

import java.util.Scanner;

public class Aims {
    public static Store store;
    public static Cart cart;
    public static void main(String[] args) {
        store = new Store();
        initData(store);
        cart = new Cart();
        StoreScreen screen = new StoreScreen(store);
    }

    /**
     * Init base data for store
     * 
     * @param store
     */
    private static void initData(Store store) {
        store.addMedia(new DigitalVideoDisc("The Lion king", "Animation", "A. Pepter", 120, 20.0f));
        store.addMedia(new DigitalVideoDisc("The shape of water", "Action", "J.Camerron", 145, 14.3f));
        store.addMedia(new DigitalVideoDisc("The Fallen kingdom", "Action", "Mical Bay", 145, 14.3f));
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
        Book book4 = new Book("The Hobbit part 2", "Adventure", 21.6f);
        book4.addAuthor("JR.Tolkien");
        store.addMedia(book4);
        store.addMedia(d1);
        store.addMedia(d2);
    }

    /**
     * Store interface
     * 
     * @param store
     * @param cart  current cart to add media
     */
    private static void viewStore(Store store, Cart cart) {
        store.printStore();
        while (true) {
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = store.searchStore(st);
                if (res != null) {
                    System.out.println(res.toString());
                    handleDetailsMenu(res, cart);
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 2) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = store.searchStore(st);
                if (res != null && cart.addMedia(res)) {
                    System.out.println("Add " + res.getTitle() + " to cart");
                    System.out.println("Current cart have " + cart.getQty() + " medias");
                } else {
                    System.out.println("Not found");
                }

            }
            if (choice == 3) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = store.searchStore(st);
                if (res != null) {
                    res.play();
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 4) {
                cart.prinCast();
            }
            if (choice == 0) {
                System.out.println("Exit Store view");
                break;
            }
        }
    }

    /**
     * Media view to add to cart or play
     * 
     * @param res  target media
     * @param cart current cart to add media
     */
    private static void handleDetailsMenu(Media res, Cart cart) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            if (cart.addMedia(res)) {
                System.out.println("Add " + res.getTitle() + " to cart");
            }
        }
        if (choice == 2) {
            res.play();
        }
        if (choice == 0) {
            System.out.println("Exit media details view");
        }
    }

    /**
     * Cart interface
     * 
     * @param cart
     */
    private static void handleCartMenu(Cart cart) {
        while (true) {
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Filter medias in cart by id/title ? (0:1): ");
                int option = input.nextInt();
                if (option == 1) {
                    System.out.print("Enter title: ");
                    input.nextLine();
                    String st = input.nextLine();
                    cart.filterByTitle(st);
                } else {
                }
            }
            if (choice == 2) {
                System.out.print("Sort medias in cart by title/cost ? (0:1): ");
                int option = input.nextInt();
                if (option == 1) {
                    cart.sortCartByCost();
                    cart.prinCast();
                } else {
                    cart.sortCartByTitle();
                    cart.prinCast();
                }
            }
            if (choice == 3) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = cart.searchCart(st);
                if (res != null) {
                    cart.removeMedia(res);
                    System.out.println("Deleted " + res.getTitle());
                    cart.prinCast();
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 4) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = cart.searchCart(st);
                if (res != null) {
                    res.play();
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 5) {
                System.out.println("An order is created!");
                cart.newCart();
            }
            if (choice == 0) {
                System.out.println("Exit cart view");
                break;
            }
        }
    }

    /**
     * Use to add or remove media from store. Currently not support add media
     * 
     * @param store
     */
    private static void updateStore(Store store) {
        System.out.println("Delete a media from store");
        System.out.print("Enter title of media: ");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        Media res = store.searchStore(st);
        if (res != null) {
            store.removeMedia(res);
            System.out.println("Deleted " + res.getTitle());
        } else {
            System.out.println("Not found");
        }

    }
}