package com.codersbay.plakolb;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> booksInLibrary = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    //Getters and Setters
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public List<Book> getBooksInLibrary() { return booksInLibrary; }

    //methods
    public void addBook(Book book) {
        booksInLibrary.add(book);
    }

    public void removeBook(Book book) {
        booksInLibrary.remove(book);
    }

    public void borrowBook(Person person, Book book) {
        //check if book exists in library & borrow it if yes
        if (booksInLibrary.contains(book)) {
            person.borrowBook(book);
            System.out.println("You successfully borrowed a book.");
        } else {
            System.out.println("This book does not exist in our library.");
        }

    }

    public void returnBook(Person person, Book book, Integer days) {
        person.returnBook(book, days);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                '}';
    }
}
