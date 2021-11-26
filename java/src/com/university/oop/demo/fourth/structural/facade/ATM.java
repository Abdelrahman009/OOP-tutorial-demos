package com.university.oop.demo.fourth.structural.facade;

import com.university.oop.demo.fourth.structural.facade.atm.peripherals.*;

public class ATM {
    private String bankName;
    private double remainingCash;
    private Keyboard keyboard;
    private Screen screen;
    private CardReader cardReader;
    private CashDispenser dispenser;
    private DepositBox depositBox;

    /**
     * Note it is better to use the builder pattern here but
     * this is a simplification for the sake of the demo.
     */
    public ATM
        (String bankName, double remainingCash, Keyboard keyboard,
         Screen screen, CardReader cardReader, DepositBox depositBox,
         CashDispenser cashDispenser) {
        this.bankName = bankName;
        this.remainingCash = remainingCash;
        this.keyboard = keyboard;
        this.screen = screen;
        this.cardReader = cardReader;
        this.depositBox = depositBox;
        this.dispenser = cashDispenser;
    }

    public String getBankName() {
        return bankName;
    }

    public double getRemainingCash() {
        return remainingCash;
    }

    public CashDispenser getDispenser() {
        return dispenser;
    }

    public DepositBox getDepositBox() {
        return depositBox;
    }

    public void addToRemainingCash(double amount) {
        this.remainingCash += amount;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public CardReader getCardReader() {
        return cardReader;
    }
}
