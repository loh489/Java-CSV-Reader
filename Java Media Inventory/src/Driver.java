import java.io.*;

public class Driver {
    private String filePath;
    private Manager manager;

    public Driver (String filePath, Manager manager) throws IOException{
        this.filePath = filePath;
        this.manager = new Manager();
    }

    public void printData () throws IOException, NumberFormatException {

        manager.loadCSV(filePath);
        
        System.out.println("The total number of products in this dataset is: " + manager.getNumProducts());
        System.out.println("The total number of movies in this dataset is " + manager.getNumMovies());
        System.out.println("The total number of tv shows in this dataset is " + manager.getNumShows());
        System.out.println("The total number of video games in this dataset is " + manager.getNumGames());
        System.out.println("The total number of music albums in this dataset is " + manager.getNumAlbums());
        System.out.println("The oldest product in this data set is " + manager.getOldestProduct());
        System.out.println("The most popular music album in this dataset is " + manager.getMostPopularAlbum());
        System.out.println("The most popular video game in  this dataset is " + manager.getMostPopularGame());
        System.out.println("The most common age rating among all film products in this dataset is " + manager.getCommonFilmRating());
        System.out.println("The shortest movie in this dataset is " + manager.getShortestMovie());
        System.out.println("The shortest music album in this dataset is " + manager.getShortestAlbum());
    }
}
