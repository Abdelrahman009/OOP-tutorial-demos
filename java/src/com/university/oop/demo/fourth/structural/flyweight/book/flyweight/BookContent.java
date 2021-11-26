package com.university.oop.demo.fourth.structural.flyweight.book.flyweight;

import java.util.Date;

/**
 * This is what is called an intrinsic state of a book
 * This is common between all copies and doesn't depend
 * in which library this book exists.
 *
 * unlike something like the print date where two copies
 * could differ in such an attribute.
 */
public class BookContent {
    private String authorName;
    private String bookIsbn;
    private String bookContent;
    private Date bookWritingDate;
    private String title;

    public BookContent
        (String authorName, String bookIsbn,
         String bookContent, Date bookWritingDate,
         String title) {

        this.authorName = authorName;
        this.bookIsbn = bookIsbn;
        this.bookContent = bookContent;
        this.bookWritingDate = bookWritingDate;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BookContent{" +
                "authorName='" + authorName + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookContent='" + bookContent + '\'' +
                ", bookWritingDate=" + bookWritingDate +
                ", title='" + title + '\'' +
                '}';
    }
}
