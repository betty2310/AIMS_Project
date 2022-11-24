public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        DigitalVideoDisc a = (DigitalVideoDisc) o1;
        DigitalVideoDisc b = (DigitalVideoDisc) o2;
        DigitalVideoDisc tmp = new DigitalVideoDisc(a.getTitle(), a.getCategory(), a.getDirector(), a.getLength(),
                a.getCost());
        a.setTitle(b.getTitle());
        a.setCategory(b.getCategory());
        a.setDirector(b.getDirector());
        a.setCost(b.getCost());
        a.setLength(b.getLength());
        b.setTitle(tmp.getTitle());
        b.setCategory(tmp.getCategory());
        b.setDirector(tmp.getDirector());
        b.setCost(tmp.getCost());
        b.setLength(tmp.getLength());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        title = oldTitle;
    }
}
