package src.hust.soict.hedspi.aims.media;

import src.hust.soict.hedspi.aims.utils.MediaComparatorByCostTitle;
import src.hust.soict.hedspi.aims.utils.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {
    }

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String category, String title, float cost) {
        this.title = title;
        this.id = id;
        this.category = category;
        this.cost = cost;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // TODO Auto-generated method stub
//        return this.title == ((Media) obj).title;
//    }

    public boolean isMatch(String st) {
        if (this.title.equals(st))
            return true;
        return false;
    }

    public abstract void play();

}
