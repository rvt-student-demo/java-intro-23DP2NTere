package lv.rvt; // Klases atrašanas vieta projektā

import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
  
        BufferedWriter writer = Helper.getWriter("data.csv", StandardOpenOption.WRITE);

        writer.write("Richard, 70");
        writer.newLine();
        writer.close();
    }

}
    




