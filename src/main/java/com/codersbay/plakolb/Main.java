package com.codersbay.plakolb;

public class Main {

    public static void main(String[] args) {

        //Create books, library and persons
        Book book1 = new Book("Charles Dickens", "A Tale of Two Cities", "English", "historical fiction", 367);
        Book book2 = new Book("Victor Hugo", "Les Misérables", "English", "historical fiction", 1232);
        Book book3 = new Book("George Orwell", "Animal Farm", "English", "Political Satire", 95);
        Book book4 = new Book("J. D. Salinger", "The Catcher in the Rye", "English", "Coming-of-Age-Fiction", 230);
        Book book5 = new Book("Michael Ende", "Die unendliche Geschichte", "German", "Fantasy", 428);
        Book book6 = new Book("Friedrich Schiller", "Wilhem Tell", "German", "Tragedy", 127);
        Book book7 = new Book("Walter Moers", "Die 13 1/2 Leben des Käpt'n Blaubär", "German", "Fantasy", 703);

        Library library = new Library("Booktopia");

        Person person1 = new Person("Hermione", "Granger", 10);
        Person person2 = new Person("Rory", "Gilmore", 58);
        Person person3 = new Person("Robert", "Bobinski", 63);
        Person person4 = new Person("Sherry", "Sheridan", 3);

        //Add and Remove books to library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);

        //borrow and return books
        person1.borrowBook(book2);
        person2.borrowBook(book1);
        person2.borrowBook(book3);
        person2.returnBook(book3, 8);
        person3.borrowBook(book5);
        person4.borrowBook(book1);
        person4.rechargeCredit(30);
        person4.borrowBook(book1);

    }
}
