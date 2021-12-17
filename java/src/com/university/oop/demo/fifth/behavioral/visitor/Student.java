package com.university.oop.demo.fifth.behavioral.visitor;

import com.university.oop.demo.fifth.behavioral.visitor.exam.question.Question;
import com.university.oop.demo.fifth.behavioral.visitor.exam.question.QuestionVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements QuestionVisitor {
    private final Map<String, List<QuestionAndAnswer>> topicToInformationMap;

    public Student() {
        topicToInformationMap = new HashMap<>();
    }

    public void study(String topic, QuestionAndAnswer questionAndAnswer) {
        topicToInformationMap.computeIfAbsent(topic, (t) -> new ArrayList<>())
            .add(questionAndAnswer);
    }

    public String solveEquation(String equation) {
        List<QuestionAndAnswer> studiedMathQuestions = topicToInformationMap.get("Math");
        for (QuestionAndAnswer studiedQuestionAndAnswer
             : studiedMathQuestions) {

            if (studiedQuestionAndAnswer.getQuestion().equals(equation))
                return studiedQuestionAndAnswer.getAnswer();
        }
        return "Couldn't solve equation";
    }

    public String translateSentence(String sourceLanguage, String sentenceToTranslate) {
        List<QuestionAndAnswer> studiedTranslationQuestions = topicToInformationMap.get
                ("Translate from " + sourceLanguage);
        for (QuestionAndAnswer studiedQuestionAndAnswer
             : studiedTranslationQuestions) {

            if (studiedQuestionAndAnswer.getQuestion().equals(sentenceToTranslate))
                return studiedQuestionAndAnswer.getAnswer();
        }
        return "Couldn't translate word";
    }

    public String recitePoem(String poemName) {
        List<QuestionAndAnswer> studiedPoetryQuestions
            = topicToInformationMap.get("Poetry");
        for (QuestionAndAnswer studiedQuestionAndAnswer
              : studiedPoetryQuestions) {

            if (studiedQuestionAndAnswer.getQuestion().equals(poemName))
                return studiedQuestionAndAnswer.getAnswer();
        }
        return "Couldn't recite poem";
    }

    @Override
    public String solveQuestion(Question question) {
        return question.solveBy(this);
    }
}
