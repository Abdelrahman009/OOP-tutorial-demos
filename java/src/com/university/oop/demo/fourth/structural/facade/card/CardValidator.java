package com.university.oop.demo.fourth.structural.facade.card;

public class CardValidator {

    private Card card;
    // let's assume we have some object representing the rules
    // needed to verify the card without diving into details.
    private Object verificationRules;

    public CardValidator(Card card) {
        this.card = card;
    }


    //
    // imagine there are some methods ....
    //

    public boolean isCardValid() {
        // Match card with rules.
        return true;
    }
}
