package com.codersbay.plakolb;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> booksInLibrary = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public ArrayList<Book> getBooksInLibrary() { return booksInLibrary; }

    //methods
    public void addBook(Book book) {
        booksInLibrary.add(book);
    }

    public void removeBook(Book book) {
        booksInLibrary.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
