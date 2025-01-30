package lv.rvt;

public class Warehouse {

    private double capacity;
    private double balance;


    public Warehouse(double capacity, double balance) {
        this.capacity = capacity;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
        
    }

    public double howMuchSpaceLeft()  {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            System.out.println("Amount: " + getBalance());
        } else if (balance + amount > capacity) {
            System.out.println("Amount: " + getCapacity());
        } else {
            System.out.println("Amount: " + getBalance() + amount);
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return balance;
        } else if (balance - amount < 0) {
            return 0;
        } else {
            return balance - amount;
        }
            
    }
         

    public String toString() {
        return "blanace = " + balance + ", space left = " + howMuchSpaceLeft();
}

}