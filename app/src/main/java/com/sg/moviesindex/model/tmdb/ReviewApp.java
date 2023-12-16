package com.sg.moviesindex.model.tmdb;


import androidx.annotation.NonNull;

public class ReviewApp {
    private String userId;
    private String reviewText;

    public ReviewApp(String userId, String reviewText) {
        this.userId = userId;
        this.reviewText = reviewText;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Override
    public String toString() {
        return "" + userId + "\n" + reviewText;
    }
}
