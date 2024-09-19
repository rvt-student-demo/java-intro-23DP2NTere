package lv.rvt; // Klases atrašanas vieta projektā

import java.util.Scanner;

public class App 

public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Give number: ");
        int number = Integer.valueOf(scanner.nextLine());
    
    while (true) {
        if (number == 0) {
            break;
        }
        else if (number < 0) {
            System.out.println("Unsuitable number");
            continue;
        }
        else{
            System.err.println(number * number);
        }

    }
}
/* {
public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Value of gift:  ");
    int value = scanner.nextInt();

    if (value < 5000) {
        System.out.println("No tax!");
    } 
    else if (value >= 5000 && value <= 25000) {
        System.out.println("Gift tax is " + (100 + (value - 5000) * 0.08));
    }
    else if (value >= 2500 && value <= 55000) {
        System.out.println("Gift tax is " + (1700 + (value - 25000) * 0.1));
    }
    else if (value >= 55000 && value <= 200000) {
        System.out.println("Gift tax is " + (4700 + (value - 55000) * 0.12));
    }
    else if (value >= 200000 && value <= 1000000) {
        System.out.println("Gift tax is " + (22100 + (value - 200000) * 0.15));
    }
    else if (value >= 1000000) {
        System.out.println("Gift tax is " + (142100 + (value - 1000000) * 0.17));
    }
}
}
/* {
    public static void main( String[] args )
    {
        /* Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet uzvārdu: ");
        String surname = scanner.nextLine();

        System.out.println("Ievadiet grupu: ");
        String group = scanner.nextLine();
    

        System.out.println(name + " " + surname + " " + group); 

         int chicken = 3;
        double bacon = 5.5;
        String tractor = "None!";

        System.out.println("Chicken: ");
        System.out.println(chicken);
        System.out.println("Bacon(kg)");
        System.out.println(bacon);
        System.out.println("Tractor");
        System.out.println(tractor);

        System.out.println("");
        System.out.println("And finally, a summary: ");
        System.out.println(chicken);
        System.out.println(bacon);
        System.out.println(tractor);
    }

} */




/* int number = 5;

if (number == 0) {
    System.out.println("The number is zero.");
} else if (number > 0) {
    System.out.println("The number is greater than zero.");
} else if (number > 2) {
    System.out.println("The number is greater than two.");
} else {
    System.out.println("The number is less than zero.");
    } */


/* public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give points [0-100]: ");
    int number = scanner.nextInt();

    if (points < 0) {
        System.out.println("Impossible!");
    } else if (number > 0 && number < 50);
        System.out.println("Failed"); {
    } else if (number > 49 && number < 60);
        System.out.println("1"); {
    } else if (number > 59 && number < 70);
        System.out.println("2"); {
    } else if (number > 69 && number < 80);
        System.out.println("3"); {
    } else if (number > 79 && number < 90);
        System.out.println("4"); {
    } else if (number > 90 && number < 101);
        System.out.println("5"); {
    } else if (number > 100); {
        System.out.println("Incredible!");
        }

    }
*/

