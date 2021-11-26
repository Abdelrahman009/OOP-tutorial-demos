package com.university.oop.demo.fourth.structural.facade;

import com.university.oop.demo.fourth.structural.facade.card.Card;
import com.university.oop.demo.fourth.structural.facade.card.CardValidator;
import com.university.oop.demo.fourth.structural.facade.network.BankCommunicationController;


/**
 * This is a Facade class that hides all the communication
 * and steps to handle events within an ATM.
 *
 * Note: This design is very simplified and for the purpose of
 *       showing the facade pattern only, more enhancements in
 *       the code can be done.
 */
public class ATMController {
    private ATM atm;
    private Card insertedCard;
    private BankCommunicationController communicationController;

    public ATMController(ATM atm, BankCommunicationController communicationController) {
        this.atm = atm;
        this.communicationController = communicationController;
    }

    //
    // imagine there are some methods ....
    //

    public void handlePowerOn() {
        atm.getKeyboard().lightKeys();
        atm.getScreen().turnOn();
        atm.getScreen().displayContent("Please enter a card");
    }

    public void handleCardReaderDetectedCard() {
        Card card = atm.getCardReader().getInsertedCardInfo();
        atm.getScreen().displayContent("Processing card");
        CardValidator cardValidator = new CardValidator(card);
        if (cardValidator.isCardValid()) {
            atm.getScreen().displayContent("Enter PIN");
            atm.getKeyboard().lightKeys();
            insertedCard = card;
        }
        else {
            atm.getCardReader().ejectCard();
        }
    }

    public void handleDeposit() {
        double amount = atm.getDepositBox().countCash();
        if (insertedCard == null) {
            throw new IllegalStateException();
        }
        atm.getDepositBox().acceptAmount();
        atm.addToRemainingCash(amount);
        communicationController.notifyBank("deposit: " + amount);
    }

    public void handlePinEntered(String pin) {
        boolean validPin = communicationController.validatePin(insertedCard, pin);
        if (validPin) {
            atm.getScreen().displayContent("Main menu");
        }
        else {
            atm.getCardReader().ejectCard();
        }
    }

    //
    // imagine there are some methods ....
    //
}
