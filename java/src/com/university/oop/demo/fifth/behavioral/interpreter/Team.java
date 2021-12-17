package com.university.oop.demo.fifth.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Team implements OrganizationalUnit {
    private String teamName;
    private List<OrganizationalUnit> teamMemberList;

    public Team(String teamName, List<OrganizationalUnit> teamMemberList) {
        this.teamName = teamName;
        this.teamMemberList = teamMemberList;
    }

    public Team(String description) {
        interpret(description);
    }

    @Override
    public String getName() {
        return teamName;
    }

    @Override
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is team " + teamName + " with members:\n");

        for (OrganizationalUnit member : teamMemberList) {
            sb.append(member.getSummary() + "\n");
        }

        return sb.toString();
    }


    /**
     * Interprets sentences with format:
     * "name" Team has members "X, Y, Z".
     */
    public void interpret(String description) {
        String[] descriptionParts = description.split("Team has members");
        this.teamName = descriptionParts[0].trim();
        this.teamMemberList = new ArrayList<>();
        String[] teamMembersDescriptions = descriptionParts[1].split(",");
        for (String teamMemberDescription : teamMembersDescriptions) {
            if (teamMemberDescription.contains("Engineer"))
                teamMemberList.add(new Engineer(teamMemberDescription));
            else if (teamMemberDescription.contains("Manager"))
                teamMemberList.add(new Manager(teamMemberDescription));
            else
                teamMemberList.add(new Tester(teamMemberDescription));
        }
    }
}
