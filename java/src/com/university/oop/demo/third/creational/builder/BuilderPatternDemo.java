package com.university.oop.demo.third.creational.builder;

import com.university.oop.demo.third.creational.builder.battery.LithiumIonBattery;
import com.university.oop.demo.third.creational.builder.battery.LithiumPolymerBattery;
import com.university.oop.demo.third.creational.builder.concretebuilders.CSED24SmartHubBuilder;
import com.university.oop.demo.third.creational.builder.concretebuilders.GoogleNestSmartHubBuilder;
import com.university.oop.demo.third.creational.builder.display.LCDDisplay;
import com.university.oop.demo.third.creational.builder.smarthub.SmartHomeHub;
import com.university.oop.demo.third.creational.builder.smarthub.SmartHouseHubImpl;
import com.university.oop.demo.third.creational.builder.speaker.StandardSpeaker;
import com.university.oop.demo.third.creational.builder.speaker.StereoSpeaker;

/**
 * A demo to illustrate the creational pattern "Builder".
 *
 * "The Builder design pattern separates the construction
 *  of a complex object from its representation so that the
 *  same construction process can create different representations."
 */
public class BuilderPatternDemo {

    /**
     * let's imagine we want to create a smart home hub
     * like Google Nest, Samsung SmartThings, Apple HomePod, ...etc.
     *
     * - Some have LCD screens, some have LED screens
     *   and some don't have any screens at all.
     *
     * - Some have stereo speakers, some have standard
     *   and some don't have any.
     *
     * - Some have built-in batteries and some don't.
     */
    public static void main(String[] args) {

        /**
         * let's do it the straight forward way.
         */
        SmartHomeHub googleBadExampleHub
            = new SmartHouseHubImpl
            (new StandardSpeaker(), new LithiumPolymerBattery(),
             null /*no display*/, false,
             true, "Google Nest Smart Hub");

        googleBadExampleHub.reportStatus();
        System.out.println("=====================");

        /**
         * let's imagine there is a graduation project to
         * create a smart house hub.
         */
        SmartHomeHub csed24BadExampleHub
            = new SmartHouseHubImpl
            (new StereoSpeaker(), new LithiumIonBattery(),
            new LCDDisplay(), false,
            true, "CSED 24 Smart Hub");

        csed24BadExampleHub.reportStatus();
        System.out.println("=====================");

        /**
         * What is the problem with the code above?
         *
         * How many dependency on concrete classes?
         *
         * Is your code open for extension?
         * are your dependencies inverted?
         *
         * what if the hub contained more things
         * like wheels to move.
         */

        System.out.println("==========***************===========");

        /**
         * let's do it using builder.
         */

        SmartHomeHubBuilder googleNestHubBuilder
            = new GoogleNestSmartHubBuilder();

        SmartHomeHubEngineer googleEngineer
                = new SmartHomeHubEngineer(googleNestHubBuilder);

        SmartHomeHub googleGoodExampleHub
                = googleEngineer.buildSmartHomeHub();

        googleGoodExampleHub.reportStatus();
        System.out.println("=====================");

        SmartHomeHubBuilder csed24HubBuilder
            = new CSED24SmartHubBuilder();

        SmartHomeHubEngineer csed24Engineer
                = new SmartHomeHubEngineer(csed24HubBuilder);

        SmartHomeHub csed24GoodExampleHub
             = csed24Engineer.buildSmartHomeHub();

        csed24GoodExampleHub.reportStatus();
        System.out.println("=====================");
    }
}
