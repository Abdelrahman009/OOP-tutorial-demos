package com.university.oop.demo.fifth.behavioral.visitor.exam.question;

/**
 * Represents the visited object.
 */
public interface Question {
    // equivalent to the accept method.
    String solveBy(QuestionVisitor visitor);
}
