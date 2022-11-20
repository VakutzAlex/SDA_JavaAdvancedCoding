package com.sda.exercises.collections.ex6;

/*
Ex 6 Ratings received. Display their average.
The numbers can not be less than 1 and greater than 6.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRatings {

    private final String name;
    private final List<Integer> ratings = new ArrayList<>();

    public ProductRatings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 6) {
            ratings.add(rating);
        } else {
            throw new IllegalArgumentException("Invalid rating" + rating);
        }
    }

    public double averageRating() {
        double avg = 0;

        if(ratings.size() == 0){
            return 0;
        }

        for (int i : ratings){
            avg += i;
        }

        return avg/ratings.size();
    }

    public double averageRatingWithStreams(){
        return ratings.stream().collect(Collectors.averagingDouble(rating -> rating));
    }
}
