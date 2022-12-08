package src.hust.soict.hedspi.aims.cart;

import java.util.ArrayList;
import src.hust.soict.hedspi.aims.media.Media;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

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

    // public void searchDVDByID() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the ID of the DVD: ");
    // String id = sc.nextLine();
    // Integer idInt = Integer.parseInt(id);
    // if (idInt < qtyOrdered) {
    // System.out.println("The DVD is in the cart!");
    // } else {
    // System.out.println("The DVD is not in the cart!");
    // }
    // }

    // public void searchDVDByTitle() {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the Title of the DVD: ");
    // String title = sc.nextLine();
    // for (int i = 0; i < qtyOrdered; ++i) {
    // if (itemsOrdered[i].isMatch(title)) {
    // System.out.println("The DVD is in the cart!");
    // return;
    // }
    // }
    // System.out.println("The DVD is not in the cart!");
    // }
    public void sortCartByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortCartByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }
}
