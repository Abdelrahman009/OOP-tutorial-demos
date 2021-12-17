package com.university.oop.demo.fifth.behavioral.command.commands;

import com.university.oop.demo.fifth.behavioral.command.Document;

public class DeleteTextCommand implements Command {
    private int deletedIndex;
    private String deletedString;
    private Document document;

    public DeleteTextCommand
        (int deletedIndex, String deletedString, Document document) {

        this.deletedIndex = deletedIndex;
        this.deletedString = deletedString;
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("= Executing delete command.");
        String newText = document.getText().substring(0, deletedIndex)
            + ((deletedIndex + deletedString.length()
                != document.getText().length())
                    ? document.getText().substring(deletedIndex + deletedString.length())
                    : "");
        document.setText(newText);
    }

    @Override
    public void unExecute() {
        System.out.println("= Unexecuting delete command.");
        String oldText = document.getText().substring(0, deletedIndex)
                + deletedString
                + ((document.getText().length() != deletedIndex)
                       ? document.getText().substring(deletedIndex)
                       : "");
        document.setText(oldText);
    }
}
