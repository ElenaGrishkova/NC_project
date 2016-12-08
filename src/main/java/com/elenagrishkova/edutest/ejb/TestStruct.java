package com.elenagrishkova.edutest.ejb;

import java.util.List;

// описание структуры тестов
public  class TestStruct {
    private List<Question> questionList;

    private String title;

    public TestStruct(String title) {
        this.title = title;
    }

    public void addQuestion (Question question) {
        questionList.add(question);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
