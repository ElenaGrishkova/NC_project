package com.elenagrishkova.edutest.ejb;

/**
 * Created by egrishkova on 30.11.2016.
 */
public class Question {

    private int number;
    private String question;
    //тип вопроса - текстовое поле, галочки, итд
    private String type;
    private String rightAnswer;
    private boolean isAutoChecked;

    public Question(int number, String question, String type, String rightAnswer, boolean isAutoChecked) {
        this.number = number;
        this.question = question;
        this.type = type;
        this.rightAnswer = rightAnswer;
        this.isAutoChecked = isAutoChecked;
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
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    public boolean isAutoChecked() {
        return isAutoChecked;
    }

    public void setAutoChecked(boolean autoChecked) {
        isAutoChecked = autoChecked;
    }
}
