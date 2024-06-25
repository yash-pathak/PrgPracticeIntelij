
import java.util.*;

class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return o.year-this.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

class RaitingCompare implements  Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
class Demo {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(8.3, "Inception", 2010));
        movies.add(new Movie(7.9, "The Dark Knight", 2008));
        movies.add(new Movie(8.1, "Interstellar", 2014));

//        Comparator<Movie> raitingComparator= new Comparator<Movie>() {
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                return Double.compare(o1.getRating(), o2.getRating());
//            }
//        };
        RaitingCompare raitingCompare =new RaitingCompare();

        Collections.sort(movies, raitingCompare);
        movies.forEach(System.out::println);
    }

}