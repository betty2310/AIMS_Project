package src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String category, float cost, String director, String artist) {
        super(title, category, cost, director);
        this.artist = artist;
        tracks = new ArrayList<Track>();
    }

    public boolean addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already exist");
            return false;
        }
        tracks.add(track);
        return true;
    }

    public boolean removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            return true;
        }
        System.out.println("track is not exist");
        return false;
    }

    public int getLength() {
        int l = 0;
        for (Track track : tracks) {
            l += track.getLength();
        }
        return l;
    }

    @Override
    public void play() {
        System.out.println("Artist: " + this.getArtist());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuffer str = new StringBuffer();

        str.append("(Compact Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$: Track: ");
        for (Track track : tracks) {
            str.append(track.toString() + ", ");
        }
        return str.toString();
    }

}
