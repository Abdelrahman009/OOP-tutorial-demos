package com.university.oop.demo.fifth.behavioral.visitor.exam.question;

public interface QuestionVisitor {
    // equivalent to the visit method.
    String solveQuestion(Question question);
    String solveEquation(String equation);
    String translateSentence(String sourceLanguage, String sentenceToTranslate);
    String recitePoem(String poemName);
}
