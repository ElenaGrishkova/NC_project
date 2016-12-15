package com.elenagrishkova.edutest.ejb;

import java.util.*;

public class Answer {
    public Answer(Question question) {
        this.question = question;
    }

    private Question question;
    //key - questionID
    private Map<Long, String> answer = new TreeMap<>();



    public boolean isAnswerRight() {
        List<String> answerList = new ArrayList<String>(answer.values());
        Collections.sort(answerList);
        Collections.sort(question.getRightAnswer());
        return answerList.equals(question.getRightAnswer());
    }
    public Map<Long, String> getAnswer() {
        return answer;
    }

    public void setAnswer(Map<Long, String> answer) {
        this.answer = answer;
    }
}
