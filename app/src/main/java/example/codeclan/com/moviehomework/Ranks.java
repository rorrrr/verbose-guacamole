package example.codeclan.com.moviehomework;

import java.util.ArrayList;

/**
 * Created by user on 17/01/2017.
 */
public class Ranks implements Rankable {
    private ArrayList<Movie> ranks;

    public Ranks(){
        ranks = new ArrayList<String>();
//        setupRanks();
    }
//
//    private void setupRanks() {
//        String[] moviesToRank = {
//                "Jaws",
//                "Jaws2",
//                "Jaws3",
//                "Shrek",
//                "Shrek2",
//                "Shrek3",
//                "AirBud",
//                "AirBud2",
//                "Airbud3",
//                "Airbud4"
//
//        };
//        for(String movie : moviesToRank){
//            rankMovie(movie);
//        }
//    }

    public Ranks(ArrayList<String> movies){
        Ranks = new ArrayList<String>(movies);
    }

    public void rankMovie(String movie){
        Ranks.rankMovie(movie);
    }

    public int getLength(){
        return ranks.size();
    }

    public String getMovieAtRank(int index){
        return ranks.get(index);
    }





}