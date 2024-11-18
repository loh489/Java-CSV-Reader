public class FilmProduct extends Product {
    private String director;
    private String country;
    private String rating;
    private String description;

    public String getDirector () {
        return director;
    }
    public void setDirector (String itemDirector) {
        director = itemDirector;
    }
    public String getCountry () {
        return country;
    }
    public void setCountry (String itemCountry) {
        country = itemCountry;
    }
    public String getRating () {
        return rating;
    }
    public void setRating (String itemRating) {
        rating = itemRating;
    }
    public String getDescription () {
        return description;
    }
    public void setDescription (String itemDescription) {
        description = itemDescription;
    }
}
