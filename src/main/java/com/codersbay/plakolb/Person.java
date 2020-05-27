package com.codersbay.plakolb;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String firstName;
    private String lastName;
    private Integer credits;
    private List<Book> bookList = new ArrayList<Book>();

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

    public List<Book> getBookList() { return bookList; }

    //method
    public void rechargeCredit(Integer credit) {
        credits += credit;
        System.out.printf("Your current credit is %d\n", credits);
    }

    public void borrowBook(Book book) {
       if (credits < 5) {
           System.out.println("You do not have enough credits to borrow a book.");
       } else if (credits == 5) {
           bookList.add(book);
           System.out.println("Your credit score is 5. Please recharge your credits soon.");
       } else {
           bookList.add(book);
       }
    }

    public void returnBook(Book book, Integer days) {
        bookList.remove(book);
        this.credits -= days;
        if (this.credits < 0) {
            System.out.println("You returned the book successfully.");
            System.out.println("Your credit has fallen under zero. Please recharge your credit.");
        } else {
            System.out.println("You returned the book successfully.");
            System.out.printf("Your credit is %d\n", credits);
        }

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
