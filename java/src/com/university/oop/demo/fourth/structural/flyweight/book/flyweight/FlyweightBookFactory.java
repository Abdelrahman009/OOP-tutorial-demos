package com.university.oop.demo.fourth.structural.flyweight.book.flyweight;

import com.university.oop.demo.fourth.structural.flyweight.book.Book;
import com.university.oop.demo.fourth.structural.flyweight.book.BookDatabase;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

/**
 * A factory that caches the books intrinsic state "BookContent"
 * so no need to create a new object, it is just shared.
 */
public class FlyweightBookFactory {

    private static HashMap<String, BookContent>
        bookTitleToContentMap = new HashMap<>();

    public static Book createBook(String bookTitle, Date printingDate) {
        BookContent content;
        if (bookTitleToContentMap.containsKey(bookTitle))
            content = bookTitleToContentMap.get(bookTitle);
        else {
            content = new BookContent
                ("Some author name",
                 String.valueOf(new Random().nextLong()),
                 BookDatabase.getBookContent(bookTitle),
                 new Date(), bookTitle);
            bookTitleToContentMap.put(bookTitle, content);
        }

        return new FlyweightBook(content, printingDate, "University");
    }
}
