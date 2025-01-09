package lv.rvt; // Klases atrašanas vieta projektā

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {

        Box box1 = new Box(2.0, 3.0, 5.0);
        System.out.println(box1.volume());
        System.out.println(box1.area());
        
        Box box2 = new Box(box1);
        System.out.println(box2.volume());
        System.out.println(box2.area());

        Box box3 = box1.biggerBox(box1);
        System.out.println(box3.area());


    }
}


        /* Scanner scanner = new Scanner(System.in);

        boolean isProgramRunning = true;

        System.out.println("Welcome to person manager, type \"help\" to see available commands.");

        while (isProgramRunning) {
            String command = scanner.nextLine();
            System.out.println("Your command was: " + command);

            if (command.equals("exit")) {
                System.out.println("Thanks, bye bye!");
                isProgramRunning = false;
            } else if (command.equals("help")) {
                System.out.println("Existing commands: \n -help \n -add \n -show \n -exit");
            }
            
        }
    }
} */



        
    




