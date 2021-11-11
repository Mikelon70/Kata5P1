package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {
    
    public static List<String> read(String fileName) throws FileNotFoundException, IOException {
        List<String> mails = new ArrayList<String>();
        String cadena;
        File file = new File(fileName);
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            if (cadena.contains("@")) {
                mails.add(cadena);
            }
        }
        b.close();
        return mails;
    }
}
