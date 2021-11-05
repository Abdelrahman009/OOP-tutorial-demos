package com.university.oop.demo.second.solid.srp;

import java.util.Date;

public class EmployeeImpl implements Employee {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public Date getDateOfBirth() {
        return null;
    }

    @Override
    public Date getDateOfEmployment() {
        return null;
    }

    @Override
    public int getYearsOfExperience() {
        return 0;
    }

    @Override
    public String getRole() {
        return null;
    }

    @Override
    public double getNetIncome() {
        double grossSalary = 5000;
        double netSalary = grossSalary * 0.775;
        return netSalary;
        // taxService.calculateNetIncome(grossIncome)
    }

    @Override
    public String getDetailedSocialReportFirstWay() {

        StringBuilder reportBuilder = new StringBuilder();
        /**
         * get the martial record
         */

        // some code ...

        /**
         * get the criminal record
         */

        // some code ...

        /**
         * get the educational history
         */

        // some code ...

        /**
         * Continues to build the report in the same manner
         * and then combines the pieces of info together.
         */

        // some code ...

        return reportBuilder.toString();
    }

    @Override
    public String getDetailedSocialReportSecondWay() {
        StringBuilder reportBuilder = new StringBuilder();

        // reportBuilder.append(getMaritalRecord());
        // reportBuilder.append(getCriminalRecord());
        // reportBuilder.append(getEducationalHistory());

        return reportBuilder.toString();
    }
}
