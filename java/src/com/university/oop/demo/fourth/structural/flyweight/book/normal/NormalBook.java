package com.university.oop.demo.fourth.structural.flyweight.book.normal;

import com.university.oop.demo.fourth.structural.flyweight.book.Book;

import java.util.Date;

public class NormalBook implements Book {
    private String authorName;
    private String title;
    private String bookIsbn;
    private String bookContent;
    private Date bookWritingDate;
    private Date printingDate;
    private String publisher;

    public NormalBook
        (String authorName, String title, String bookIsbn,
         String bookContent, Date bookWritingDate,
         Date printingDate, String publisher) {

        this.authorName = authorName;
        this.title = title;
        this.bookIsbn = bookIsbn;
        this.bookContent = bookContent;
        this.bookWritingDate = bookWritingDate;
        this.printingDate = printingDate;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "NormalBook{" +
                "authorName='" + authorName + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookContent='" + bookContent + '\'' +
                ", bookWritingDate=" + bookWritingDate +
                ", printingDate=" + printingDate +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public String getBookTitle() {
        return title;
    }
}
