package lv.rvt; // Klases atrašanas vieta projektā

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        int number = 0;
        System.out.println("Enter numbers: ");
        while (number != -1) {
            number = scanner.nextInt();
            statistics.addNumber(number);

            //statistics.addNumber(2);
        }

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
        
    }
}



