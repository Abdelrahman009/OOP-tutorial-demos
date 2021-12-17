package com.university.oop.demo.fifth.behavioral.visitor;

import com.university.oop.demo.fifth.behavioral.visitor.exam.Exam;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.LiteratureQuestion;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.MathQuestion;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.Question;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.SpanishQuestion;

import java.util.ArrayList;
import java.util.List;

/**
 * A demo to illustrate the behavioral pattern "Visitor"
 *
 * "The Visitor design pattern represents an operation to
 *  be performed on the elements of an object structure.
 *  This pattern lets you define a new operation without
 *  changing the classes of the elements on which it operates."
 *
 *  Let's assume we are modeling a situation where a student
 *  studies for his midterm and final exams and solves them.
 *
 *  The student passes by all the questions and provide
 *  answers to them through already studied information.
 */
public class VisitorDesignPatternDemo {
    public static void main(String[] args) {
        Student student = new Student();

        /**
         * Let's study some Math problems.
         */
        student.study("Math", new QuestionAndAnswer("3 + 4", "7"));
        student.study("Math", new QuestionAndAnswer("3 * 4", "12"));
        student.study("Math", new QuestionAndAnswer("4 * 4", "16"));

        /**
         * Let's study some poems.
         */
        student.study("Poetry", new QuestionAndAnswer
                      ("Dirge", "some poetry for Shakespeare"));


        /**
         * Let's study some languages.
         */
        student.study("Translate from spanish", new QuestionAndAnswer
                      ("Soy un estudiante", "I am a student"));


        /**
         * let's imagine that the midterm exam is only one paper with a question
         * for each subject.
         */
        Exam midtermExam = new Exam
            (new Question[] {
                    new LiteratureQuestion("A Fairy Song"),
                    new MathQuestion("3 + 4"),
                    new SpanishQuestion("Soy un estudiante")
            });

        /**
         * A bad way to do this is to do it in the following way.
         */
        List<String> answers = new ArrayList<>();
        for (Question question : midtermExam.getQuestions()) {
            if (question instanceof MathQuestion)
                answers.add(student.solveEquation
                            (((MathQuestion) question).getEquation()));
            else if (question instanceof SpanishQuestion)
                answers.add
                    (student.translateSentence
                     ("spanish",
                      ((SpanishQuestion) question).getSentenceToTranslate()));
            else if (question instanceof LiteratureQuestion)
                answers.add(student.recitePoem
                            (((LiteratureQuestion) question).getPoemName()));

        }
        printAnswers("midterm wrong way", answers.toArray(new String[0]));

        /**
         * In the approach above we clearly violate the OCP and our code
         * is tightly coupled.
         *
         * A better approach to the problem is by using the visitor pattern.
         */
        String[] studentMidtermAnswers = midtermExam.solveBy(student);
        printAnswers("midterm", studentMidtermAnswers);

        /**
         * Let's study some more for the finals.
         */
        student.study
            ("Translate from spanish", new QuestionAndAnswer
             ("Soy ingeniero", "I am an engineer"));

        Exam finalExam = new Exam
            (new Question[] {
                    new LiteratureQuestion("Dirge"),
                    new MathQuestion("7 * 4"),
                    new SpanishQuestion("Soy ingeniero")
            });

        String[] studentFinalAnswers = finalExam.solveBy(student);
        printAnswers("final", studentFinalAnswers);
    }

    private static void printAnswers(String examName, String[] answers) {
        System.out.println("Answers for exam (" + examName + "):");
        for (String answer : answers) {
            System.out.println(answer);
        }
        System.out.println("=========END===========");
    }
}
