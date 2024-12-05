package lv.rvt;


public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal(double money) {
        // register initially has 1000 euros of money
        this.money = money;
    }

    public double eatAffordably(double payment) {
        double costAffordably = 2.5;
        if (payment >= costAffordably) {
            this.money += costAffordably;
            this.affordableMeals++;
            return payment - costAffordably;
        } else {
            return payment;
        }

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {
        double costHeartily = 4.3;
        if (payment >= costHeartily) {
            this.money += costHeartily;
            this.heartyMeals++;
            return payment - costHeartily;
        } else {
            return payment;
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public String toString() {
       return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

    public boolean eatAffordably(PaymentCard card) {

        double costAffordably = 2.5;
        if (card.takeMoney(costAffordably)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        double costHeartily = 4.3;
        if (card.takeMoney(costHeartily)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
    
    }
}
