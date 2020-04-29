package com.codersbay.plakolb;

public class Book {

    private String author;
    private String title;
    private String language;
    private String genre;
    private Integer numOfPages;

    public Book(String author, String title, String language, String genre, Integer numOfPages) {
        this.author = author;
        this.title = title;
        this.language = language;
        this.genre = genre;
        this.numOfPages = numOfPages;
    }

    //Getters
    public String getAuthor() { return author; }

    public String getTitle() { return title; }

    public String getLanguage() { return language; }

    public String getGenre() { return genre; }

    public Integer getNumOfPages() { return numOfPages; }

    //Setters
    public void setAuthor(String author) { this.author = author; }

    public void setTitle(String title) { this.title = title; }

    public void setLanguage(String language) { this.language = language; }

    public void setGenre(String genre) { this.genre = genre; }

    public void setNumOfPages(Integer numOfPages) { this.numOfPages = numOfPages; }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                ", numOfPages=" + numOfPages +
                '}';
    }
}
