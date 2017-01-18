import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        final String pathToResultFile = "result.txt";
        final String pathToSourceFile = "URL.txt";

        ArrayList<String> listOfURL = new ArrayList();
        FileHelper fh = new FileHelper();

        //Читаем из файла URL.TXT ссылки и записываем их построчно в arraylist
        fh.readFromFile(pathToSourceFile, listOfURL);

        // Создаём файл для записи результов
        fh.createResultFile(pathToResultFile);

        // Распределяем задания по потокам
        ExecutorService taskExecutor = Executors.newFixedThreadPool(20);
        TaskClass tc = new TaskClass();
        for (String url : listOfURL) {
            taskExecutor.execute(() -> tc.task(url, pathToResultFile));
        }
        taskExecutor.shutdown();
    }
}





