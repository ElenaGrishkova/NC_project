package com.elenagrishkova.edutest.ejb;

import java.util.List;

/**
 * Created by egrishkova on 30.11.2016.
 */

//Абстрактное описание структуры тестов
public  class TestStruct {
    private List<Question> questionList;

    public void addQuestion (Question question) {
        questionList.add(question);
    }
}
