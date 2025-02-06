package lv.rvt;

public class AnimalFlying extends Animal {

    private double flyingSpeed;    

    public AnimalFlying(double weight, double height, String name, double flyingSpeed) {
        super(weight, height, name);
        this.flyingSpeed = flyingSpeed;
        
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }
}
