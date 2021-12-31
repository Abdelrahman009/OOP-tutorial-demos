package com.university.oop.demo.fifth.behavioral.command.commands;

import com.university.oop.demo.fifth.behavioral.command.Document;

public class PasteTextCommand implements Command {
    private int pastingIndex;
    private String pastedString;
    private Document document;

    public PasteTextCommand
         (int pastingIndex, String pastedString, Document document) {

        this.pastingIndex = pastingIndex;
        this.pastedString = pastedString;
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("= Executing paste command.");
        String newText = document.getText().substring(0, pastingIndex)
            + pastedString
            + ((document.getText().length() != pastingIndex)
                   ? document.getText().substring(pastingIndex)
                   : "");
        document.setText(newText);
    }

    @Override
    public void unExecute() {
        System.out.println("= Unexecuting paste command.");
        String oldText = document.getText().substring(0, pastingIndex)
            + ((pastingIndex + pastedString.length()
                != document.getText().length())
                   ? document.getText().substring(pastingIndex + pastedString.length())
                   : "");
        document.setText(oldText);
    }
}
