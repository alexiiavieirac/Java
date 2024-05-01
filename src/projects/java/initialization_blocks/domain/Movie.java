package projects.java.initialization_blocks.domain;

public class Movie {
    private String nameMovie;
    private int[] episodeMovie;

    {
        System.out.println("Inside initialization blocks.");

        episodeMovie = new int[10];

        for (int i = 0; i < episodeMovie.length; i++) {
            episodeMovie[i] = i + 1;
        }
    }

    public Movie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public Movie() {
        for (int episode : this.episodeMovie) {
            System.out.println(episode + " ");
        }
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public int[] getEpisodeMovie() {
        return episodeMovie;
    }

    public void showScreen() {
        System.out.println(this.nameMovie);
    }
}
