package com.university.oop.demo.fifth.behavioral.interpreter;

public class Tester implements OrganizationalUnit {
    private String name;
    private float yearsOfExperience;

    public Tester(String description) {
        interpret(description);
    }

    public Tester(String name, float yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSummary() {
        return "I am a Tester called " + name + " with "
            + yearsOfExperience + " years of experience.";
    }

    /**
     * Interprets sentences with format:
     * Tester "name"("yearsOfExperience" years of experience).
     */
    public void interpret(String description) {
        String[] descriptionParts = description.split("\\(");
        this.name = descriptionParts[0].trim().split(" ")[1];
        this.yearsOfExperience
            = Float.parseFloat(descriptionParts[1].trim().split(" ")[0]);
    }
}
