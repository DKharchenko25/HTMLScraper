public class Main {

    public static void main(String[] args) {
        Scraper scraper = new ScraperImpl();
        scraper.writePageToFile("https://zavet.kiev.ua/ua", "index.html");
        scraper.writePageToFile("https://zavet.kiev.ua/ua/about_us.html", "about.html");
        scraper.writePageToFile("https://zavet.kiev.ua/ua/baktericidnoe-oborudovanie/recirkulyatory-ultrafioletovye/",
                "content.html");
    }
}
