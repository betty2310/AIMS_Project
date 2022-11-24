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
}
