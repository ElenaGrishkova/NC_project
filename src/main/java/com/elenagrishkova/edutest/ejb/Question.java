package com.elenagrishkova.edutest.ejb;

import java.util.Collections;
import java.util.List;

/**
 * Created by egrishkova on 30.11.2016.
 */
public class Question {
    private long id;
    private int number;
    private String question;
    //тип вопроса - текстовое поле, галочки, итд
    private String type;
    //варианты ответов
    private List<String> answerOptions;
    private List<String> rightAnswer;
    private boolean isAutoChecked;



    public Question(int number, String question, String type, List<String> rightAnswer, boolean isAutoChecked, List<String> answerOptions) {
        this.number = number;
        this.question = question;
        this.type = type;
        this.rightAnswer = rightAnswer;
        this.isAutoChecked = isAutoChecked;
        this.answerOptions = answerOptions;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getType() {
        System.out.println("Get type = " + type);
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(List<String> rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public boolean isAutoChecked() {
        return isAutoChecked;
    }

    public void setAutoChecked(boolean autoChecked) {
        isAutoChecked = autoChecked;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
