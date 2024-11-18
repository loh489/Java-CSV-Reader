import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Manager {
    private ArrayList<Product> products = new ArrayList<Product>();

    public void loadCSV (String file) throws IOException, NumberFormatException {
        try (BufferedReader reader = new BufferedReader( new FileReader(file))) {
            String line;

            while((line = reader.readLine()) != null) {
                String[] ss = line.split(",");

                if (ss.length >= 2) {
                    String productType = ss[1];
                    if (productType.equals("Movie")) {
                        try {
                            Movie movie = new Movie();

                            int id = Integer.parseInt(ss[0]);
                            String title = ss[2];
                            String director = ss[3];
                            String country = ss[4];
                            int releaseYear = Integer.parseInt(ss[5]);
                            String rating = ss[6];
                            int duration = Integer.parseInt(ss[7]);
                            String desciption = ss[8];

                            movie.setId(id);
                            movie.setTitle(title);
                            movie.setDirector(director);
                            movie.setCountry(country);
                            movie.setReleaseYear(releaseYear);
                            movie.setRating(rating);
                            movie.setDurationMinutes(duration);
                            movie.setDescription(desciption);

                            products.add(movie);
                        }
                        catch (NumberFormatException nfe) {
                            nfe.printStackTrace();
                        }

                    }
                    else if (productType.equals("TV Show")) {
                        try {
                            TVShow show = new TVShow();

                            int id = Integer.parseInt(ss[0]);
                            String title = ss[2];
                            String director = ss[3];
                            String country = ss[4];
                            int releaseYear = Integer.parseInt(ss[5]);
                            String rating = ss[6];
                            String numSeasons = ss[7];
                            String description = ss[8];

                            show.setId(id);
                            show.setTitle(title);
                            show.setDirector(director);
                            show.setCountry(country);
                            show.setReleaseYear(releaseYear);
                            show.setRating(rating);
                            show.setNumSeasons(numSeasons);
                            show.setDescription(description);

                            products.add(show);
                        } catch (NumberFormatException nfe) {
                           nfe.printStackTrace();
                        }
                    }
                    else if (productType.equals("Video Game")) {
                        try {
                            VideoGame game = new VideoGame();

                            int id = Integer.parseInt(ss[0]);
                            String title = ss[2];
                            String platform = ss[3];
                            int releaseYear = Integer.parseInt(ss[4]);
                            String genre = ss[5];
                            String publisher = ss[6];
                            double copiesSold = Double.parseDouble(ss[7]);

                            game.setId(id);
                            game.setTitle(title);
                            game.setPlatform(platform);
                            game.setReleaseYear(releaseYear);
                            game.setGenre(genre);
                            game.setPublisher(publisher);
                            game.setCopiesSold(copiesSold);

                            products.add(game);
                        } catch (NumberFormatException nfe) {
                            nfe.printStackTrace();
                        }
                    }
                    else if (productType.equals("Music Album")) {
                        try {
                            MusicAlbum album = new MusicAlbum();

                            int id = Integer.parseInt(ss[0]);
                            int releaseYear = Integer.parseInt(ss[2]);
                            String artist = ss[3];
                            String title = ss[4];
                            int globalSales = Integer.parseInt(ss[5]);
                            int tracks = Integer.parseInt(ss[6]);
                            double duration = Double.parseDouble(ss[7]);
                            String genre = ss[8];

                            album.setId(id);
                            album.setReleaseYear(releaseYear);
                            album.setArtist(artist);
                            album.setTitle(title);
                            album.setGlobalSales(globalSales);
                            album.setTracks(tracks);
                            album.setDurationMinutes(duration);
                            album.setGenre(genre);

                            products.add(album);
                        } catch (NumberFormatException nfe) {
                            nfe.printStackTrace();
                        }
                    }
                }

                else {
                    System.out.println("Something went wrong while parsing the string.");
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public int getNumProducts () {
        if (products == null || products.isEmpty()) {
            return 0; 
        }
        return products.size();
    }
    public int getNumMovies () {
        if (products == null || products.isEmpty()) {
            return 0; 
        }
        int numMovies = 0;

        for (Product product : products) {
            if (product instanceof Movie) {
                ++numMovies;
            }
        }

        return numMovies;
    }
    public int getNumShows () {
        if (products == null || products.isEmpty()) {
            return 0; 
        }
        int numShows = 0;

        for (Product product : products) {
            if (product instanceof TVShow) {
                ++numShows;
            }
        }

        return numShows;
    }
    public int getNumGames () {
        if (products == null || products.isEmpty()) {
            return 0; 
        }
        int numGames = 0;

        for (Product product : products) {
            if (product instanceof VideoGame) {
                ++numGames;
            }
        }

        return numGames;
    }
    public int getNumAlbums () {
        if (products == null || products.isEmpty()) {
            return 0; 
        }
        int numAlbums = 0;

        for (Product product : products) {
            if (product instanceof MusicAlbum) {
                ++numAlbums;
            }
        }
    
        return numAlbums;
    }
    public String getOldestProduct () {
        if (products == null || products.isEmpty()) {
            return null; 
        }
        Product oldestProduct = products.get(0);

        for (Product product : products) {
            if (product.getReleaseYear() < oldestProduct.getReleaseYear()) {
                oldestProduct = product;
            }
        }

        return oldestProduct.getTitle();
    }
    public String getMostPopularAlbum() {
        if (products == null || products.isEmpty()) {
            return null; 
        }

        MusicAlbum mostPopularAlbum = null;
        for (Product product : products) {
            if (product instanceof MusicAlbum) {
                MusicAlbum album = (MusicAlbum) product;
                if (mostPopularAlbum == null || album.getGlobalSales() > mostPopularAlbum.getGlobalSales()) {
                    mostPopularAlbum = album;
                }
            }
        }
    
        return mostPopularAlbum.getTitle();
    }
    public String getMostPopularGame() {
        if (products == null || products.isEmpty()) {
            return null;
        }
    
        VideoGame mostPopularGame = null;
        for (Product product : products) {
            if (product instanceof VideoGame) {
                VideoGame game = (VideoGame) product;
                if (mostPopularGame == null || game.getCopiesSold() > mostPopularGame.getCopiesSold()) {
                    mostPopularGame = game;
                }
            }
        }
    
        return mostPopularGame.getTitle();
    }
    public String getCommonFilmRating() {
        if (products == null || products.isEmpty()) {
            return null;
        }
    
        Set<String> ratingValues = new HashSet<>();

        for (Product product: products) {
            if (product instanceof FilmProduct) {
                ratingValues.add(((FilmProduct) product).getRating());
            }
        }

        String[] ratingArray = ratingValues.toArray(new String[0]);
        int[] numRating = new int[ratingArray.length];

        for (int i = 0; i < ratingArray.length; ++i) {
            for (Product product : products) {
                if (product instanceof FilmProduct) {
                    FilmProduct film = (FilmProduct) product;

                    if (film.getRating().equals(ratingArray[i])) {
                        ++numRating[i];
                    }
                }
            }
        }
        int indexOfCommonRating = 0;
        int cR = 0;
        for (int i = 0; i < numRating.length; ++i) {
            if (numRating[i] > cR) {
                cR = numRating[i];
                indexOfCommonRating = i;
            }
        }

        return ratingArray[indexOfCommonRating];
        
    }
    public String getShortestMovie () {
        Movie shortestMovie = new Movie();
        shortestMovie.setDurationMinutes(1000000000);

        for (Product product : products) {
            if (product instanceof Movie) {
                Movie movie = (Movie) product;

                if (movie.getDurationMinutes() < shortestMovie.getDurationMinutes()) {
                    shortestMovie = movie;
                }
            }
        }

        return shortestMovie.getTitle();
    }
    public String getShortestAlbum () {
        MusicAlbum shortestAlbum = new MusicAlbum();
        shortestAlbum.setDurationMinutes(1000000000.00);

        for (Product product : products) {
            if (product instanceof MusicAlbum) {
                MusicAlbum album = (MusicAlbum) product;

                if (album.getDurationMinutes() < shortestAlbum.getDurationMinutes()) {
                    shortestAlbum = album;
                }
            }
        }

        return shortestAlbum.getTitle();
    }
    
}
