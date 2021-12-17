package com.university.oop.demo.fifth.behavioral.command;

import com.university.oop.demo.fifth.behavioral.command.commands.Command;
import com.university.oop.demo.fifth.behavioral.command.commands.DeleteTextCommand;
import com.university.oop.demo.fifth.behavioral.command.commands.PasteTextCommand;
import com.university.oop.demo.fifth.behavioral.command.commands.TypeLetterCommand;

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

        Command typeLetterCommand = new TypeLetterCommand('.', document);
        typeLetterCommand.execute();
        System.out.println(document.getText());

        Command pasteCommand = new PasteTextCommand
            (0,"Hi everyone this is pasted", document);
        pasteCommand.execute();
        System.out.println(document.getText());

        Command deleteCommand = new DeleteTextCommand(3, "everyone ", document);

        deleteCommand.execute();
        System.out.println(document.getText());

        deleteCommand.unExecute();
        System.out.println(document.getText());

        pasteCommand.unExecute();
        System.out.println(document.getText());
    }
}
