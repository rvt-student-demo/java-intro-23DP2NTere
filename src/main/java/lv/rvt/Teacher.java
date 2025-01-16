package lv.rvt;

public class Teacher extends Person2 {

    private int salary;

    public Teacher(int salary, String name, String adress) {
        super(name, adress);


    }
    @Override
    public String toString() {
        return getName() + "\n" + "  " + getAdress() + "\n" + "  " + "Salary: " + ;
    }
}
