package com.university.oop.demo.fifth.behavioral.command;

import com.university.oop.demo.fifth.behavioral.command.commands.Command;
import com.university.oop.demo.fifth.behavioral.command.commands.DeleteTextCommand;
import com.university.oop.demo.fifth.behavioral.command.commands.PasteTextCommand;
import com.university.oop.demo.fifth.behavioral.command.commands.TypeLetterCommand;

import java.util.Stack;

/**
 * A demo to illustrate the behavioral pattern "Command"
 *
 * "The Command design pattern encapsulates a request as an object,
 *  thereby letting you parameterize clients with different requests,
 *  queue or log requests, and support undoable operations."
 *
 *  Let's imagine that we are designing a text editor and we want
 *  to add the undo/redo functionality.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {

        /**
         * A straight forward approach is to save a snapshot of the
         * whole document by copying it every time a change occurs.
         *
         * Why this isn't the best solution in our case?
         *
         * Why not keeping the operations only?
         */
        Document document = new Document();

        /* Saving the whole document */
        Stack<Document> undoStack = new Stack<>();

        /*
         * Action #1
         *
         * record the document status to be able to undo
         * then add my text.
         */
        undoStack.add(document.copy());
        document.setText("first text.");
        System.out.println(document.getText());

        /*
         * Action #2
         */
        undoStack.add(document.copy());
        document.setText(document.getText() + "\nsecond text.");
        System.out.println(document.getText());

        /*
         * Action #3
         *
         * perform undo
         */
        document = undoStack.pop();
        System.out.println(document.getText());


        /*
         * Action #4
         *
         * perform undo
         */
        document = undoStack.pop();
        System.out.println(document.getText());

        System.out.println("======================================");

        Stack<Command> undoCommandStack = new Stack<>();

        /* Saving the operations only */
        Command typeLetterCommand = new TypeLetterCommand('.', document);
        undoCommandStack.add(typeLetterCommand);
        typeLetterCommand.execute();
        System.out.println(document.getText());

        Command pasteCommand = new PasteTextCommand
            (0,"Hi everyone this is pasted", document);
        undoCommandStack.add(pasteCommand);
        pasteCommand.execute();
        System.out.println(document.getText());

        Command deleteCommand = new DeleteTextCommand(3, "everyone ", document);
        undoCommandStack.add(deleteCommand);
        deleteCommand.execute();
        System.out.println(document.getText());

        undoCommandStack.pop().unExecute();
        System.out.println(document.getText());

        undoCommandStack.pop().unExecute();
        System.out.println(document.getText());
    }
}
