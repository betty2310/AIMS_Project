package src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public Book() {

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
}
