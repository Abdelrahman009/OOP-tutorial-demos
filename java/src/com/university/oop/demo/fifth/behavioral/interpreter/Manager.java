package com.university.oop.demo.fifth.behavioral.interpreter;

public class Manager implements OrganizationalUnit {
    private String name;
    private String managerialLevel;
    private float yearsOfExperience;

    public Manager(String description) {
        interpret(description);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSummary() {
        return "I am a " + managerialLevel + " level manager called " + name + " with "
            + yearsOfExperience + " years of experience.";
    }

    /**
     * Interprets sentences with format:
     * "managerialLevel" Manager "name"("yearsOfExperience" years of experience).
     */
    public void interpret(String description) {
        String[] descriptionParts = description.split("\\(");
        this.name = descriptionParts[0].trim().split("Manager")[1].trim();
        this.managerialLevel = descriptionParts[0].trim().split("Manager")[0].trim();
        this.yearsOfExperience
                = Float.parseFloat(descriptionParts[1].trim().split(" ")[0]);
    }
}
