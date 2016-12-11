package com.elenagrishkova.edutest.ejb;

import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class DataSourсe {
    private Map<String, TestStruct> testStructMap = new HashMap<>();

    {
        //init
        TestStruct testStruct = new TestStruct("ТЕСТ 1");
        testStruct.addQuestion(new Question(1, "Опиши, что знаешь", "text", null, false, null));
        testStruct.addQuestion(new Question(2, "Выдели 1 и 3", "checkbox", new ArrayList<>(Arrays.asList("1", "3")), true, new ArrayList<>(Arrays.asList("1", "2", "3"))));
        testStruct.addQuestion(new Question(3, "который час?", "radio", new ArrayList<>(Arrays.asList("17.00")), true, new ArrayList<>(Arrays.asList("11.69", "25.32", "17.00"))));
        testStructMap.put(testStruct.getTitle(), testStruct );
        testStruct = new TestStruct("ТЕСТ 2");
        testStruct.addQuestion(new Question(1, "Как тебя зовут?", "text", null, false, null));
        testStruct.addQuestion(new Question(2, "Выдели 2 и 3", "checkbox", new ArrayList<>
                (Arrays.asList("2", "3")), true, new ArrayList<>(Arrays.asList("1", "2", "3"))));
        testStruct.addQuestion(new Question(3, "угадай вариант", "radio", new ArrayList<>
                (Arrays.asList("42")), true, new ArrayList<>(Arrays.asList("13", "3fff", "42"))));
        testStructMap.put(testStruct.getTitle(), testStruct );

    }

    public Map<String, TestStruct> getTestStructMap() {
        return testStructMap;
    }
}
