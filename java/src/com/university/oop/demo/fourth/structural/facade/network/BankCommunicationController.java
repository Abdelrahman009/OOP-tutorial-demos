package com.university.oop.demo.fourth.structural.facade.network;


import com.university.oop.demo.fourth.structural.facade.card.Card;

/**
 * This is a very simplified example for the
 * sake of the demo.
 */
public class BankCommunicationController {

    public void notifyBank(String action) {
        // notifying bank
        System.out.println("Notifying bank with: " + action);
    }

    public boolean validatePin(Card card, String pin) {
        // Validating pin through the bank.
        return true;
    }
}
