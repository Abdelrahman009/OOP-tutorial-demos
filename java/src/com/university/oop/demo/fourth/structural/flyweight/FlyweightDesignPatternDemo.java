package com.university.oop.demo.fourth.structural.flyweight;

import com.university.oop.demo.fourth.structural.flyweight.book.Book;
import com.university.oop.demo.fourth.structural.flyweight.book.BookDatabase;
import com.university.oop.demo.fourth.structural.flyweight.book.flyweight.FlyweightBookFactory;
import com.university.oop.demo.fourth.structural.flyweight.book.normal.NormalBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * A demo that illustrates the structural design pattern "Flyweight"
 *
 * "The Flyweight design pattern uses sharing to support large
 *  numbers of fine-grained objects efficiently."
 *
 *  Let's imagine we are modeling a library system in our code.
 *
 *  Each library would have a list of printed copies of certain
 *  books.
 *
 *  We want to instantiate those libraries to use in our code.
 *
 *
 *  Note: ''' The Flyweight pattern targets the efficiency of
 *            memory and time of our code so we will measure
 *            the difference between using and not using the pattern
 *            in execution time. '''
 */
public class FlyweightDesignPatternDemo {

    public static void main(String[] args) {

        /**
         * The next four lists are the titles of the books found in
         * four different libraries.
         *
         * For illustration purposes we will instantiate the books
         * in the first two libraries without using the flyweight
         * pattern, and the latter two with using the flyweight pattern.
         */
        String[] firstNormalLibraryBookTitles = new String[] {
            "Book 1", "Book 2", "Book 3", "Book 4", "Book 5",
            "Book 6", "Book 7", "Book 8", "Book 9", "Book 10"
        };

        /**
         * Note that this list has 5 common books with the one
         * above.
         */
        String[] secondNormalLibraryBookTitles = new String[] {
            "Book 1", "Book 2", "Book 3", "Book 4", "Book 5",
            "Book 11", "Book 12", "Book 13", "Book 14", "Book 15"
        };

        String[] firstFlyweightLibraryBookTitles = new String[] {
            "Book A", "Book B", "Book C", "Book D", "Book E",
            "Book F", "Book G", "Book H", "Book I", "Book J"
        };

        /**
         * Note that this list has 5 common books with the one
         * above.
         */
        String[] secondFlyweightLibraryBookTitles = new String[] {
            "Book A", "Book B", "Book C", "Book D", "Book E",
            "Book K", "Book L", "Book M", "Book N", "Book O"
        };

        /**
         * Capture the start time of creating the normal books without
         * using the pattern.
         */
        long startTime = System.currentTimeMillis();

        /**
         * Create the first library book objects and add them to
         * the library.
         */
        Library firstNormalLibrary = new Library();
        Book[] firstNormalLibraryBooks = createNormalBooksWithTitles
            (firstNormalLibraryBookTitles);
        firstNormalLibrary.addBookCopies(firstNormalLibraryBooks);

        /**
         * Create the second library book objects and add them to
         * the library.
         */
        Library secondNormalLibrary = new Library();
        Book[] secondNormalLibraryBooks = createNormalBooksWithTitles
            (secondNormalLibraryBookTitles);
        secondNormalLibrary.addBookCopies(secondNormalLibraryBooks);

        /**
         * monitor the end time and calculate the loading time.
         */
        long endTime = System.currentTimeMillis();
        double duration = (endTime - startTime) /1000.0;
        System.out.println("normal loading took (sec): " + duration);

        /**
         * Let's repeat the same steps but with using the pattern.
         */
        startTime = System.currentTimeMillis();
        Library firstFlyweightLibrary = new Library();
        Book[] flyweightFirstLibraryBooks = createFlyweightBooksWithTitles
            (firstFlyweightLibraryBookTitles);
        firstFlyweightLibrary.addBookCopies(flyweightFirstLibraryBooks);

        Library secondFlyweightLibrary = new Library();
        Book[] flyweightSecondLibraryBooks = createFlyweightBooksWithTitles
                (secondFlyweightLibraryBookTitles);
        secondFlyweightLibrary.addBookCopies(flyweightSecondLibraryBooks);

        endTime = System.currentTimeMillis();
        duration = (endTime - startTime) /1000.0;
        System.out.println("flyweight loading took (sec): " + duration);

        /**
         * The time of the second seems to be around 75% of the first
         * could you explain why?
         */
    }

    /**
     * Creates a book in the traditional way without any caching.
     * "Asks the database each time to fetch the content"
     */
    private static Book[] createNormalBooksWithTitles(String[] titles) {
        ArrayList<Book> books = new ArrayList<>();
        for (String title : titles) {
            books.add(new NormalBook(
                    "Some author",
                    title,
                    String.valueOf(new Random().nextLong()),
                    BookDatabase.getBookContent(title),
                    new Date(),
                    new Date(),
                    "any publisher"
            ));
        }
        return books.toArray(new Book[0]);
    }

    /**
     * Creates the book making use of caching the intrinsic state
     * "state that doesn't vary from one book copy to another" using
     * the flyweight factory.
     */
    private static Book[] createFlyweightBooksWithTitles(String[] titles) {
        ArrayList<Book> books = new ArrayList<>();
        for (String title : titles) {
            books.add(FlyweightBookFactory.createBook(title, new Date()));
        }
        return books.toArray(new Book[0]);
    }
}
