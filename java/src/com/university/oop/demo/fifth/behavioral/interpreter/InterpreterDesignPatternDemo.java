package com.university.oop.demo.fifth.behavioral.interpreter;

/**
 * A demo to illustrate the behavioral design pattern "Interpreter"
 * or "Little language".
 *
 * "Given a language, the Interpreter design pattern defines a
 *  representation for its grammar along with an interpreter that
 *  uses the representation to interpret sentences in the language."
 */
public class InterpreterDesignPatternDemo {
    /**
     * Let's assume that in our program we receive a description
     * of a company hierarchy in a known format.
     *
     * A complete example would be:
     *
     * CSED24 Company has teams: Testing Team has members Tester Alice(5 years of experience),
     * Tester Bob(3 years of experience).
     * Management Team has members Middle Level Manager
     * Debra(15 years of experience), Top Level Manager Luke(30 years of experience).
     * Development Team has members Computer Engineer Martin(8 years of experience).
     *
     * We have a fixed format here:
     *
     * "A Team has members X, Y, Z.
     *  B Team has members M, N.
     *  C Team has members I, J."
     *
     *  For members they are written in the format:
     *   - Mechanical Engineer John(8 years of experience)
     *   - Computer Engineer Martin(10 years of experience)
     *   - Top Level Manager Dexter(25 years of experience)
     *   - Tester Alice(5 years of experience).
     *   .... so on.
     *
     * The problem we are trying to solve is given a string that
     * follows this format (Grammar) how to translate them
     * (interpret) to objects.
     */
    public static void main(String[] args) {
        String description
            = "CSED24 Company has teams: Testing Team has members Tester Alice(5 years of experience), "
            + "Tester Bob(3 years of experience)."
            + " Management Team has members Middle Level Manager"
            + " Debra(15 years of experience), Top Level Manager Luke(30 years of experience)."
            + " Development Team has members Computer Engineer Martin(8 years of experience).";

        Company company = new Company(description);
        System.out.println(company.getSummary());
    }
}

