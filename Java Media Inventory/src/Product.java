public class Product {
    private int id;
    private String title;
    private int releaseYear; 

    public int getId () {
        return id;
    }
    public void setId (int itemId) {
        id = itemId;
    }
    public String getTitle () {
        return title;
    }
    public void setTitle (String itemTitle) {
        title = itemTitle;
    }
    public int getReleaseYear () {
        return releaseYear;
    }
    public void setReleaseYear (int itemReleaseYear) {
        releaseYear = itemReleaseYear;
    }
}