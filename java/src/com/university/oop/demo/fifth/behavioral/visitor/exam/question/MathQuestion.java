package com.university.oop.demo.fifth.behavioral.visitor.exam.question;

public class MathQuestion implements Question {
    private String equation;

    public MathQuestion(String equation) {
        this.equation = equation;
    }

    @Override
    public String solveBy(QuestionVisitor visitor) {
        return visitor.solveEquation(equation);
    }

    public String getEquation() {
        return equation;
    }
}
