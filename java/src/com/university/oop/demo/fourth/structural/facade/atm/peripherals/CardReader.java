package com.university.oop.demo.fourth.structural.facade.atm.peripherals;

import com.university.oop.demo.fourth.structural.facade.card.Card;

public class CardReader {
    //
    // imagine there are some methods ....
    //

    public Card getInsertedCardInfo() {
        // Imagine there is code that actually retrieves
        // values from the inserted card.

        return new Card
             ("John Doe", "2024",
              "111", "MasterCard");
    }

    public void ejectCard() {
        System.out.println("Ejecting card");
    }

    //
    // imagine there are some methods ....
    //
}
