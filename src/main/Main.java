import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

import lv.rvt.tools.Helper;

public class Main {
    
    public static void main(String[] args) throws Exception{
        BufferedWriter writer = Helper.getWriter("data.csv", StandardOpenOption.WRITE);

        writer.write("Richard, 70");
        writer.newLine();
        writer.close();
    }
}
