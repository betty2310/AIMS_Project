package src.hust.soict.hedspi.aims.cart;

import java.util.Scanner;

import src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        qtyOrdered++;
        if (qtyOrdered <= MAX_NUMBER_ORDERED) {
            int i = qtyOrdered - 1;
            itemsOrdered[i] = disc;
            System.out.println("The disc has been added!");
        } else {
            System.out.println("The disc is almost full!");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; ++i) {
            addDigitalVideoDisc(dvdList[i]);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart have 0 dict");
        } else {
            qtyOrdered--;
            for (int i = 0; i < itemsOrdered.length; ++i) {
                if (disc.equals(itemsOrdered[i])) {
                    for (int j = i; j < itemsOrdered.length - 1; ++j) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    itemsOrdered[itemsOrdered.length - 1] = null; // set last element to null
                    break;
                }
            }
        }
    }

    public float totalCost() {
        float sum = 0.0f;
        int i = 0;
        while (itemsOrdered[i] != null) {
            sum += itemsOrdered[i].getCost();
            ++i;
        }
        return sum;
    }

    public void prinCast() {
        System.out.println("***********************CART***********************\nOrdered Items:");
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(i + 1 + ". " + itemsOrdered[i].toString() + "\n");
        }
        System.out.println("Total cost: " + totalCost() + "\n***************************************************");

    }

    public void searchDVDByID() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the DVD: ");
        String id = sc.nextLine();
        Integer idInt = Integer.parseInt(id);
        if (idInt < qtyOrdered) {
            System.out.println("The DVD is in the cart!");
        } else {
            System.out.println("The DVD is not in the cart!");
        }
    }

    public void searchDVDByTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Title of the DVD: ");
        String title = sc.nextLine();
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("The DVD is in the cart!");
                return;
            }
        }
        System.out.println("The DVD is not in the cart!");
    }
}
