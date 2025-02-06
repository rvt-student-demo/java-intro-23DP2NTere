package lv.rvt;

public class AnimalLand extends Animal {

    private double runningSpeed;    

    public AnimalLand(double weight, double height, String name, double runningSpeed) {
        super(weight, height, name);
        this.runningSpeed = runningSpeed;
        
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }
}
