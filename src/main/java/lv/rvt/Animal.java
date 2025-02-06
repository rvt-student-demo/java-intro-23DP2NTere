package lv.rvt;

public abstract class Animal {

    private double weight;
    private double height;
    private String name;

    public Animal(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHeight() {
        return height;
    }
}
