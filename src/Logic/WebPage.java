package Logic;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebPage {

    private Anchor anchor;
    private String webPageHash;
    private int anchorParse;
    private int emailParseStatus;

    private Document document;


    // Generate Constructor for Crawling
    public WebPage(Anchor anchor) {
        this.anchor = anchor;
    }

    // JSoup for HTML
    public void loadDocumentFromWeb(){

        try {
            document = Jsoup.connect("http://en.jsoup.org/").get();
            Elements links = document.select("a");

            for (Element e: links){
                System.out.println(e.attr("abs:href"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
