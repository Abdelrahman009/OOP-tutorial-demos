package com.university.oop.demo.fifth.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Company implements OrganizationalUnit {
    private String name;
    private List<OrganizationalUnit> organizationalUnitList;

    public Company(String description) {
        interpret(description);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is Company " + name + " with units:\n");

        for (OrganizationalUnit unit : organizationalUnitList) {
            sb.append(unit.getSummary() + "\n");
        }

        return sb.toString();
    }

    /**
     * Interprets sentences with format:
     * "name" Company has teams: "X, Y, Z".
     */
    @Override
    public void interpret(String description) {
        String[] descriptionParts = description.split("Company has teams:");
        this.name = descriptionParts[0].trim();
        this.organizationalUnitList = new ArrayList<>();
        String[] teamDescriptions = descriptionParts[1].split("\\.");
        for (String teamDescription : teamDescriptions)
            organizationalUnitList.add(new Team(teamDescription));
    }
}
