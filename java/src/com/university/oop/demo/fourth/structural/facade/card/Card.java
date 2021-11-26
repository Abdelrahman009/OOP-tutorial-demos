package com.university.oop.demo.fourth.structural.facade.card;

public class Card {
    private String ownerName;
    private String cardNumber;
    private String cvv;
    private String type;

    public Card(String ownerName, String cardNumber,
                String cvv, String type) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public String getType() {
        return type;
    }
}
