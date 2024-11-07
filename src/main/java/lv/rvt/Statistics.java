package lv.rvt;

public class Statistics {
    private int count;
    private int sum;


    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double) sum / count;
    } 
}

