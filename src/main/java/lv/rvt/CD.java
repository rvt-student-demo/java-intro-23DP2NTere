package lv.rvt;

public class CD implements Packable {
    private String artist;
    private String name;
    private int year;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        System.out.println(name + artist + " (" + year + ")");
    }

    @Override
    public double weight() {
        return 0.1;
    }
}
