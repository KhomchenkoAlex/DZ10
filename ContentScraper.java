import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by alex on 11.01.17.
 */
public class ContentScraper {
    public String scrapFromURL(String URLString) {

        InputStream is = null;
        StringBuilder result = new StringBuilder();
        String line;

        try {
            URL url = new URL(URLString);
            is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                result.append(line);
            }

        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return result.toString();
    }
}
