package com.university.oop.demo.fourth.structural.flyweight.book.flyweight;

import com.university.oop.demo.fourth.structural.flyweight.book.Book;

import java.util.Date;

public class FlyweightBook implements Book {
    private BookContent content;
    private Date printingDate;
    private String publisher;

    public FlyweightBook
        (BookContent content, Date printingDate,
         String publisher) {

        this.content = content;
        this.printingDate = printingDate;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "FlyweightBook{" +
                "content=" + content +
                ", printingDate=" + printingDate +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public String getBookTitle() {
        return content.getTitle();
    }
}
