public class VideoGame extends Product {
    private String platform;
    private String genre;
    private String publisher;
    private double copiesSoldMillions;

    public String getPlatform () {
        return platform;
    }
    public void setPlatform (String itemPlatform) {
        platform = itemPlatform;
    }
    public String getGenre () {
        return genre;
    }
    public void setGenre (String itemGenre) {
        genre = itemGenre;
    }
    public String getPublisher () {
        return publisher;
    }
    public void setPublisher(String itemPublisher) {
        publisher = itemPublisher;
    }
    public double getCopiesSold () {
        return copiesSoldMillions;
    }
    public void setCopiesSold (double itemCopiesSold) {
        copiesSoldMillions = itemCopiesSold;
    }
}
