package com.university.oop.demo.second.solid.srp;

import java.util.Date;

/**
 * This is a demo to illustrate the SRP.
 *
 * "A class should have only one reason to change"
 */
public interface Employee {
    String getName();
    Date getDateOfBirth();
    Date getDateOfEmployment();
    int getYearsOfExperience();
    String getRole();

    /**
     * Calculates the net income
     * after taxes.
     */
    double getNetIncome();

    /**
     * Returns a report on the marital status,
     * criminal record, education history ....
     */
    String getDetailedSocialReportFirstWay();
    String getDetailedSocialReportSecondWay();
}
