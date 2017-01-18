import java.io.*;
import java.util.ArrayList;

/**
 * Created by alex on 11.01.17.
 */
public class FileHelper {

    void readFromFile(String pathToSourceFile, ArrayList listOfURL) {
        try {
            File file = new File(pathToSourceFile);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                listOfURL.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void createResultFile(String pathToResultFile) {
        try {
            File resultfile = new File(pathToResultFile);
            if (resultfile.createNewFile()) {
                System.out.println("файл result.txt успешно создан");
            } else System.out.println("файл result.txt уже существует");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void appendToFile(String pathtofile, String text) {
        File file = new File(pathtofile);
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
