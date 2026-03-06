public class Movie_Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();
        Movie myMovie1 = new Movie("Superman " , "Fiction");
        Movie myMovie2 = new Movie("Spiderman" , "Hero ", 20);

        System.out.println("Movie title: " + myMovie.getTitle() + "\n" + "Genre: " + myMovie.getGenre() + "\n" + "Rating: " + myMovie.getRating());
        System.out.println("Movie title: " + myMovie1.getTitle() + "\n" + "Genre: " + myMovie1.getGenre());
        System.out.println("Movie title: " + myMovie2.getTitle() + "\n" + "Genre: " + myMovie2.getGenre() + "\n" + "Rating: " + myMovie2.getRating());
    }
}
