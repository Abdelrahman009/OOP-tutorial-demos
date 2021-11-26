package com.university.oop.demo.fourth.structural.facade;

import com.university.oop.demo.fourth.structural.facade.atm.peripherals.*;
import com.university.oop.demo.fourth.structural.facade.network.BankCommunicationController;

/**
 * A demo to illustrate the structural pattern "Facade"
 *
 * "The Facade design pattern provides a unified interface
 *  to a set of interfaces in a subsystem. This pattern defines
 *  a higher-level interface that makes the subsystem easier to use."
 */
public class FacadeDesignPatternDemo {

    public static void main(String[] args) {
        // All the ATM details are hidden by the ATM Facade
        ATMController atmFacade = new ATMController
            (new ATM("CIB", 20000.0,
                     new Keyboard(), new Screen(),
                     new CardReader(), new DepositBox(),
                     new CashDispenser()),
             new BankCommunicationController());

        // The main function code just deals with this one object.
        atmFacade.handlePowerOn();
        atmFacade.handleCardReaderDetectedCard();
        atmFacade.handlePinEntered("1234");
        atmFacade.handleDeposit();
    }
}
