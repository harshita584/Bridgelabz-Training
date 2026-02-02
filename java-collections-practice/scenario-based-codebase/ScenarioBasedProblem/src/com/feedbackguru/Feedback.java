package com.feedbackguru;

public class Feedback<T> {
    private T type;
    private String text;
    private int rating;

    public Feedback(T type, String text, int rating) {
        this.type = type;
        this.text = text;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getText() {
        return text;
    }
}
