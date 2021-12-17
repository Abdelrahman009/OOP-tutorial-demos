package com.university.oop.demo.fifth.behavioral.visitor.exam.question;

public class SpanishQuestion implements Question {

    private String sentenceToTranslate;

    public SpanishQuestion(String sentenceToTranslate) {
        this.sentenceToTranslate = sentenceToTranslate;
    }

    @Override
    public String solveBy(QuestionVisitor visitor) {
        return visitor.translateSentence("spanish", sentenceToTranslate);
    }

    public String getSentenceToTranslate() {
        return sentenceToTranslate;
    }
}
