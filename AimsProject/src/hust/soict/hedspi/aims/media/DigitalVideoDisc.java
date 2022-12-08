package src.hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0;
    private int length;
    private String director;

    public String getTitle() {
        return this.title;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        super(title);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        nbDigitalVideoDiscs++;
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - "
                + length + " : " + cost + "$";
    }

    public boolean isMatch(String title) {
        // compare this.title vs title
        return this.title.contains(title);
    }
}