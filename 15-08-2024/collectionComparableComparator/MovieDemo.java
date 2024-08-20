package com.collectionComparableComparator;

public class MovieDemo implements Comparable<MovieDemo>{
	
	private String title;
    private int yearOfRelease;
    private double rating;

    public MovieDemo(String title, int yearOfRelease, double rating) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(MovieDemo other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Movie: " + title + ", Year: " + yearOfRelease + ", Rating: " + rating;
    }
	
	

}
