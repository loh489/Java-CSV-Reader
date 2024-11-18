public class MusicAlbum extends Product {
    private String artist;
    private int globalSales;
    private int tracks;
    private double durationMinutes;
    private String genre;

    public String getArtist () {
        return artist;
    }
    public void setArtist (String itemArtist) {
        artist = itemArtist;
    }
    public int getGlobalSales () {
        return globalSales;
    }
    public void setGlobalSales (int itemSales) {
        globalSales = itemSales;
    }
    public int getTracks () {
        return tracks;
    }
    public void setTracks (int itemTracks) {
        tracks = itemTracks;
    }
    public double getDurationMinutes () {
        return durationMinutes;
    }
    public void setDurationMinutes (double itemDuration) {
        durationMinutes = itemDuration;
    }
    public String getGenre () {
        return genre;
    }
    public void setGenre (String itemGenre) {
        genre = itemGenre;
    }
}