package com.university.oop.demo.fifth.behavioral.command.commands;

import com.university.oop.demo.fifth.behavioral.command.Document;

public class TypeLetterCommand implements Command {
    private char typedLetter;
    private Document document;

    public TypeLetterCommand(char typedLetter, Document document) {
        this.typedLetter = typedLetter;
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("= Executing typing command.");
        document.setText(document.getText() + typedLetter);
    }

    @Override
    public void unExecute() {
        System.out.println("= Unexecuting typing command.");
        document.setText(document.getText().substring(0, document.getText().length() - 1));
    }
}
