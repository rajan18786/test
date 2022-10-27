package com.markspencer.price;

import java.util.Arrays;
import java.util.List;

public class Review {

    private String productId;
    private String feedback;
    private Double rating;

    public Review(String productId, String feedback, Double rating) {
        this.productId = productId;
        this.feedback = feedback;
        this.rating = rating;
    }

    public Review() {

    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    private static List<Review> reviewList = Arrays.asList(
            new Review("12", "Good", 4.2),
            new Review("23", "Excellent", 4.5),
            new Review("45", "Average", 3.5)
    );

    public static Review getById(String id) {
        System.out.println("Inside getById");
        return reviewList.stream().filter(price -> price.getProductId().equals(id)).findFirst().orElse(null);
    }
}
