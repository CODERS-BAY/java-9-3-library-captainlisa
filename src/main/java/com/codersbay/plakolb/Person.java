package com.codersbay.plakolb;

import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private Integer credits;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public Person(String firstName, String lastName, Integer credits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.credits = credits;
    }

    //Getters and Setters
    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public Integer getCredits() { return credits; }

    public void setCredits(Integer credits) { this.credits = credits; }

    public ArrayList<Book> getBookList() { return bookList; }

    //method
    public void rechargeCredit(Integer credit) {
        credits += credit;
        System.out.printf("Your current credit is %d\n", credits);
    }

    public void borrowBook(Book book) {
       if (credits < 5) {
           System.out.println("You do not have enough credits to borrow a book.");
       } else {
           bookList.add(book);
       }
    }

    public void returnBook(Book book, Integer days) {
        bookList.remove(book);
        credits -= days;
        System.out.println("You returned the book successfully.");
        System.out.printf("Your credit is %d\n", credits);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", credits=" + credits +
                '}';
    }
}
