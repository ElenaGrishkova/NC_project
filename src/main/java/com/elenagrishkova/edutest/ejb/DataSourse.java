package com.elenagrishkova.edutest.ejb;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourse {
    private Map<String, TestStruct> testStructMap = new HashMap<>();

    {
        //init
        TestStruct testStruct = new TestStruct();
        testStruct.addQuestion(new Question(1, "Опиши, что знаешь", "text", null, false));
        testStruct.addQuestion(new Question(2, "Выдели 1 и 3", "checkbox", "42", true));
        testStruct.addQuestion(new Question(3, "который час?", "radio", "42", true));
        testStructMap.put("ТЕСТ 1", testStruct );
        testStruct = new TestStruct();
        testStruct.addQuestion(new Question(1, "Как тебя зовут?", "text", null, false));
        testStruct.addQuestion(new Question(2, "Выдели 2 и 3", "checkbox", "42", true));
        testStruct.addQuestion(new Question(3, "угадай вариант", "radio", "42", true));
        testStructMap.put("ТЕСТ 2", testStruct );

    }

    public Map<String, TestStruct> getTestStructMap() {
        return testStructMap;
    }
}
