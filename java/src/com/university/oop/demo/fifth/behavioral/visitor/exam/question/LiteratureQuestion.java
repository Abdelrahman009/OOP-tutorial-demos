package com.university.oop.demo.fifth.behavioral.visitor.exam.question;

public class LiteratureQuestion implements Question {
    private String poemName;

    public LiteratureQuestion(String poemName) {
        this.poemName = poemName;
    }

    @Override
    public String solveBy(QuestionVisitor visitor) {
        return visitor.recitePoem(poemName);
    }

    public String getPoemName() {
        return poemName;
    }
}
