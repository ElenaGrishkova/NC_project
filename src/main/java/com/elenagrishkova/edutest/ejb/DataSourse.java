package com.elenagrishkova.edutest.ejb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourse {
    private Map<String, TestStruct> testStructMap = new HashMap<>();

    {
        //init
        TestStruct testStruct = new TestStruct();
        testStruct.addQuestion(new Question(1, "Как тебя зовут?", "text", null, false));
        testStruct.addQuestion(new Question(2, "который час?", "checkbox", "42", true));
        testStruct.addQuestion(new Question(3, "который час?", "radio", "42", true));
        testStructMap.put("ТЕСТ 1", testStruct );
    }

    public Map<String, TestStruct> getTestStructMap() {
        return testStructMap;
    }
}
