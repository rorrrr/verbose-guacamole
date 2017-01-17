package example.codeclan.com.moviehomework;

/**
 * Created by user on 17/01/2017.
 */

public class Movie {
    private String title;
    private int rank;
    private String genre;

    public Movie(String title, int rank, String genre) {
        this.title = title;
        this.rank = rank;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRank(){
        return this.rank;
    }

    public String showDetails() {
        return "Title: " + this.title + ",  Genre: " + this.genre + ",  Rank: " + this.rank;
    }
}
