package com.university.oop.demo.third.creational.builder.smarthub;

import com.university.oop.demo.third.creational.builder.battery.Battery;
import com.university.oop.demo.third.creational.builder.display.Display;
import com.university.oop.demo.third.creational.builder.speaker.Speaker;

public class SmartHouseHubImpl implements SmartHomeHub {

    private Speaker speakerIfAny;
    private Battery batteryIfAny;
    private Display displayIfAny;
    private boolean isPluggedIn;
    private boolean isActivated;
    private String name;


    /**
     * This is not a good constructor but there for
     * explanation purposes.
     *
     * What if I confused the two booleans order?
     */
    public SmartHouseHubImpl
        (Speaker speakerIfAny, Battery batteryIfAny,
         Display displayIfAny, boolean isPluggedIn,
         boolean isActivated, String name) {

        this.speakerIfAny = speakerIfAny;
        this.batteryIfAny = batteryIfAny;
        this.displayIfAny = displayIfAny;
        this.isPluggedIn = isPluggedIn;
        this.isActivated = isActivated;
        this.name = name;
    }



    public SmartHouseHubImpl(String name) {
        this.name = name;
    }

    @Override
    public void reportStatus() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("Hello this is " + name + " \n");
        if (batteryIfAny != null) {
            String batteryStatus
                = batteryIfAny.getBatteryReport();
            reportBuilder.append("Battery Status:\n");
            reportBuilder.append(batteryStatus + "\n");
        }
        reportBuilder.append("PluginStatus:\n");
        reportBuilder.append(getPluginStatus());
        announceStatusTroughOutputs(reportBuilder.toString());
    }

    @Override
    public void setSpeaker(Speaker speaker) {
        speakerIfAny = speaker;
    }

    @Override
    public void setDisplay(Display display) {
        displayIfAny = display;
    }

    @Override
    public void setBattery(Battery battery) {
        batteryIfAny = battery;
    }

    @Override
    public void plugDevice() {
        isPluggedIn = true;
    }

    @Override
    public void unplugDevice() {
        isPluggedIn = false;
    }

    @Override
    public void activate() {
        isActivated = true;
    }

    //
    // Private methods.
    //

    private String getPluginStatus() {
        if (isPluggedIn)
            return "plugged in";
        else
            return "unplugged";
    }

    private void announceStatusTroughOutputs(String status) {
        if (speakerIfAny != null)
            speakerIfAny.playSound(status);
        if (displayIfAny != null)
            displayIfAny.displayContent(status);
    }
}
