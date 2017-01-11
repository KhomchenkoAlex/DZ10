/**
 * Created by alex on 11.01.17.
 */
public class TaskClass {
    public void task(String URL, String pathToFile) {

        ContentScraper cs = new ContentScraper();
        MD5Hasher hasher = new MD5Hasher();
        FileHelper fl = new FileHelper();
        String stringForHash = cs.scrapFromURL(URL);
        String hash = hasher.getMD5Hash(stringForHash);
        fl.appendToFile(pathToFile, URL + " : " + hash);
    }
}
