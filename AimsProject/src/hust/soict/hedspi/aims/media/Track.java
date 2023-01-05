package src.hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track() {

    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.length == ((Track) obj).length && this.title == ((Track) obj).title;
    }

    @Override
    public String toString() {
        return this.getTitle() + " - " + this.getLength();
    }

    @Override
    public void play() {

    }
}
