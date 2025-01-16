package lv.rvt;

public class Student extends Person2 {

    private int credits = 0;

    public Student(String name, String adress) {
        super(name, adress);

    }
    public int credits() {
        return credits;
    }   

    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        return getName() + "\n" + "  " + getAdress() + "\n" + "  " + "Study credits: " + credits;
    }
}

