package com.university.oop.demo.fourth.structural.flyweight;

import com.university.oop.demo.fourth.structural.flyweight.book.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * A library class that contains a bunch of printed
 * book copies.
 */
public class Library {
    private List<Book> bookCopiesList;

    public Library() {
        bookCopiesList = new ArrayList<>();
    }

    public void addBookCopies(Book[] books) {
        for (Book book : books)
            addBookCopy(book);
    }

    public void addBookCopy(Book book) {
        bookCopiesList.add(book);
    }

    public void listBooks() {
        for (Book book : bookCopiesList) {
            System.out.println(book.getBookTitle());
            System.out.println();
        }
    }
}
