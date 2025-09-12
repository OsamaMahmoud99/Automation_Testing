package courses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("Hello World");
            writer.flush();
            writer.close();

            BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        

    }
}
