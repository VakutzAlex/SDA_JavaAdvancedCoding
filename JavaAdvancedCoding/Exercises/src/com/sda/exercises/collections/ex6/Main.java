package com.sda.exercises.collections.ex6;

/*
Ex 6 Ratings received.
Display their average.
The numbers can not be less than 1 and greater than 6.
 */

public class Main {

    public static void main(String[] args) {
        ProductRatings bread = new ProductRatings("Bread");

        bread.addRating(6);
        bread.addRating(4);
        bread.addRating(5);
        bread.addRating(6);

        System.out.println("Average of " + bread.getName() + " ratings is: " + bread.averageRating());
        System.out.println("Average of " + bread.getName() + " ratings with streams is: " + bread.averageRatingWithStreams());

        try {
            bread.addRating(0);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        try{
            bread.addRating(8);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Average of " + bread.getName() + " ratings is: " + bread.averageRating());
        System.out.println("Average of " + bread.getName() + " ratings with streams is: " + bread.averageRatingWithStreams());
    }
}
