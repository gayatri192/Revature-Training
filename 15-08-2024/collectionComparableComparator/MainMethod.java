package com.collectionComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainMethod {
	
	public static void main(String[] args) {
        List<MovieDemo> movies = new ArrayList<>();

        // Adding five favorite movies to the list
        movies.add(new MovieDemo("Munjya", 2024, 8.8));
        movies.add(new MovieDemo("The Demon", 2022, 9.0));
        movies.add(new MovieDemo("The Lion King", 2019, 8.6));
        movies.add(new MovieDemo("The Avengers", 2012, 8.6));
        movies.add(new MovieDemo("Stree2", 2024, 9.3));

        // Display the original list of movies
        System.out.println("Original List of Movies:");
        for (MovieDemo movie : movies) {
            System.out.println(movie);
        }

        // Sort by Year of Release first, then by Rating
        Collections.sort(movies, Comparator
                .comparing(MovieDemo::getYearOfRelease)
                .thenComparing(Comparator.comparing(MovieDemo::getRating).reversed()));

        // Display the sorted list of movies
        System.out.println("\nMovies Sorted by Year of Release, then by Rating:");
        for (MovieDemo movie : movies) {
            System.out.println(movie);
        }
    }

}
