package com.svgs;

import javafx.beans.property.SimpleStringProperty;

public class Book {
    private SimpleStringProperty bookTitle;
    private SimpleStringProperty bookAuthor;
    private SimpleStringProperty bookYear;
    private SimpleStringProperty bookGenre;
    private SimpleStringProperty bookRating;

    public Book(String t, String a, String y, String g, String r) {
        bookTitle = new SimpleStringProperty(t);
        bookAuthor = new SimpleStringProperty(a);
        bookYear = new SimpleStringProperty(y);
        bookGenre = new SimpleStringProperty(g);
        bookRating = new SimpleStringProperty(r);
    }

    public SimpleStringProperty getTitleProperty() {
        return bookTitle;
    }
    public SimpleStringProperty getAuthorProperty() {
        return bookAuthor;
    }
    public SimpleStringProperty getYearProperty() {
        return bookYear;
    }
    public SimpleStringProperty getGenreProperty() {
        return bookGenre;
    }
    public SimpleStringProperty getRatingProperty() {
        return bookRating;
    }
}
