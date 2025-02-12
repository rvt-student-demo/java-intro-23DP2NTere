package lv.rvt;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
        System.out.println(author + ": " + name);
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
