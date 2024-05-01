package projects.java.initialization_blocks.test;

import projects.java.initialization_blocks.domain.Movie;

public class MovieTest01 {
    public static void main(String[] args) {
        Movie movie = new Movie("Hackers");

        movie.showScreen();

        for (int episode : movie.getEpisodeMovie()) {
            System.out.println(episode);
        }

    }
}
