package com.university.oop.demo.fourth.structural.flyweight.book;

import java.util.HashMap;
import java.util.Random;

/**
 * This imitates a database call where each class has its own generated
 * content, when you ask for the same book again the same content is
 * retrieved.
 */
public class BookDatabase {
    private static HashMap<String, String> titleToRandomlyGeneratedContent
         = new HashMap<>();

    public static String getBookContent(String title) {
        // simulate database delay by delaying for 200ms
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (titleToRandomlyGeneratedContent.containsKey(title))
            return titleToRandomlyGeneratedContent.get(title);

        String randomGeneratedString
             = generateRandomAlphabeticString
             (100000);

        titleToRandomlyGeneratedContent.put(title, randomGeneratedString);
        return randomGeneratedString;
    }

    // this code is taken from
    // https://www.baeldung.com/java-random-string
    private static String generateRandomAlphabeticString(int targetStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        String generatedString = random.ints
            (leftLimit, rightLimit + 1)
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        return generatedString;
    }

}
