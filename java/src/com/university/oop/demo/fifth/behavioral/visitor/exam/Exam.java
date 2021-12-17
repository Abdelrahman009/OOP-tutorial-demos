package com.university.oop.demo.fifth.behavioral.visitor.exam;

import com.university.oop.demo.fifth.behavioral.visitor.Student;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.Question;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private Question[] questions;

    public Exam(Question[] questions) {
        this.questions = questions;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public String[] solveBy(Student student) {
        List<String> answers = new ArrayList<>();
        for (Question question : questions)
            answers.add(student.solveQuestion(question));
        return answers.toArray(new String[0]);
    }
}
