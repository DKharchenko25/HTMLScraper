import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScraperImpl implements Scraper {
    @Override
    public void writePageToFile(String url, String fileName) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            Document document = Jsoup.connect(url).get();
            String content = document.outerHtml();
            bufferedWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
