package homeWorkPart2.task2;

public class Main {

    public static void main(String[] args) {

        Movie.MovieCreator movieCreator = new Movie.MovieCreator();
        Movie starIsBorn = movieCreator
                .setTitle("A Star is Born")
                .setDirector("Bradley Cooper")
                .setYearOfRelease(2018)
                .setGenre(Genre.DRAMA)
                .setDistributor("Warner Bros.")
                .createMovie();

        System.out.println(starIsBorn);
    }
}
