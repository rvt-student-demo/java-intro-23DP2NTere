package lv.rvt;
import java.util.*;
import java.io.*;

public class BogoSort {


    

        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> numbers = new ArrayList<Double>(); 

        Random rand = new Random();
        for (double i = 0; i < 11; i++) {
            int min = 1, max = 20;

            
            double rand2 = (rand.nextInt(max - min + 1) + min);
            numbers.add(rand2); 
        }
    
        

        System.out.println(numbers);

        System.out.println("Imput your number from 1 (included) to 20 (included): " + "\n");
        int value = scanner.nextInt();

} 
}       
