package lv.rvt; // Klases atrašanas vieta projektā

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi vārdu: ");
        String name = scanner.nextLine();

        System.out.println("Ievadiet uzvārdu: ");
        String surname = scanner.nextLine();

        System.out.println("Ievadiet grupu: ");
        String group = scanner.nextLine();
    

        System.out.println(name + " " + surname + " " + group);
    }

}
