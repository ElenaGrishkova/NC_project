package com.elenagrishkova.edutest.ejb;

import javax.annotation.ManagedBean;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
public class DataSourсe {
    private Map<String, TestStruct> testStructMap = new HashMap<>();

    {
        //init
        TestStruct testStruct = new TestStruct("ТЕСТ 1");
        testStruct.addQuestion(new Question(1, "Опиши, что знаешь", "text", null, false));
        testStruct.addQuestion(new Question(2, "Выдели 1 и 3", "checkbox", "42", true));
        testStruct.addQuestion(new Question(3, "который час?", "radio", "42", true));
        testStructMap.put(testStruct.getTitle(), testStruct );
        testStruct = new TestStruct("ТЕСТ 2");
        testStruct.addQuestion(new Question(1, "Как тебя зовут?", "text", null, false));
        testStruct.addQuestion(new Question(2, "Выдели 2 и 3", "checkbox", "42", true));
        testStruct.addQuestion(new Question(3, "угадай вариант", "radio", "42", true));
        testStructMap.put(testStruct.getTitle(), testStruct );

    }

    public Map<String, TestStruct> getTestStructMap() {
        return testStructMap;
    }
}
