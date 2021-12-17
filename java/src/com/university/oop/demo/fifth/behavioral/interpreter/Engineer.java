package com.university.oop.demo.fifth.behavioral.interpreter;

public class Engineer implements OrganizationalUnit {
    private String name;
    private String field;
    private float yearsOfExperience;

    public Engineer(String description) {
        interpret(description);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSummary() {
        return "I am a " + field + " Engineer called " + name + " with "
            + yearsOfExperience + " years of experience.";
    }

    /**
     * Interprets sentences with format:
     * "field" Engineer "name"(10 years of experience)
     */
    public void interpret(String description) {
        String[] descriptionParts = description.split("\\(");
        this.name = descriptionParts[0].trim().split("Engineer")[1].trim();
        this.field = descriptionParts[0].trim().split("Engineer")[0].trim();
        this.yearsOfExperience
            = Float.parseFloat(descriptionParts[1].trim().split(" ")[0]);
    }
}
