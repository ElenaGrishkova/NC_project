package com.elenagrishkova.edutest.ejb;

import org.omg.CORBA.Object;

import java.util.List;

/**
 * Created by egrishkova on 30.11.2016.
 */
public class Question {

    private int number;
    private String question;
    //тип вопроса - текстовое поле, галочки, итд
    private String type;
    private List rightAnswer;
    private String userAnswer; //?????
    private boolean isAutoChecked;
    private List answerOptions;


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

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answerOptions = answerOptions;
    }
}
