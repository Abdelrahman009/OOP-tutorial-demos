package com.university.oop.demo.fifth.behavioral.command;

public class Document {
    private String text;

    public Document() {
        this.text = "";
    }

    private Document(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Document copy() {
        return new Document(text);
    }
}
