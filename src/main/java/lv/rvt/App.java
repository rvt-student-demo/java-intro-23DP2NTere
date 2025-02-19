package lv.rvt; // Klases atrašanas vieta projektā

import java.util.Arrays;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws Exception {
        
        int[] intArr = {5, 4, 3, 7, 6, 2};
        double[] doubleArr = {5.6, 4.4, 3.3, 1.8, 2.0};
        String[] stringArr = {"cc", "bb", "aa", "ac"};

        //Parastā masīva printēšana
        System.out.println(Arrays.toString(intArr));
    
        //Masīva kātošana
        Arrays.sort(doubleArr);

        System.out.println(Arrays.toString(doubleArr));

        ArrayList<Person2> personList = new ArrayList<>();
        personList.add(new Person2("John", "Riga"));
    
        //Filtrēšana
        int[] intArr2 = {5, 4, 3, 7, 6, 2};
        String[] stringArr2 = {"John", "Bob", " Peter", "Jack"};
        for (String value : stringArr2) {
            if (value.contains("ete")) {
                System.out.println(value);                
            }
        }    
    }
        

}


        
    




