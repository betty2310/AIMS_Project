package src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book(String string, String string2, float f) {
        super(string, string2, f);
    }

    /**
     * Add author to list and check if author is already exist
     * 
     * @param authorName
     * @return
     */
    public boolean addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already exist");
            return false;
        }
        authors.add(authorName);
        return true;
    }

    /**
     * Remove author from list and check if author is exist
     * 
     * @param authorName
     * @return
     */
    public boolean removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
            return true;
        }
        System.out.println("Author is not exist");
        return false;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("(Book): " + this.getTitle() + " - " + this.getCategory() + " - ");
        for (String author : authors) {
            str.append(author + ", ");
        }
        return str.toString() + ": " + this.getCost() + "$";
    }

    public void play() {
    }
}
