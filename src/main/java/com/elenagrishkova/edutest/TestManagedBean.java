package com.elenagrishkova.edutest;
import com.elenagrishkova.edutest.ejb.Answer;
import com.elenagrishkova.edutest.ejb.DataSourсe;
import com.elenagrishkova.edutest.ejb.TestStruct;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Named
@RequestScoped
public class TestManagedBean {
    @Inject
    private DataSourсe dataSourсe;
    private List<String> userAnswerList;
    private String userAnswer;
    private TestStruct currentTest;
    private List<Answer> answerList;
    private Map<Long, List<String>> answerMap;
    private String page = "/WEB-INF/pages/startPage.xhtml";

    public String getPage() {
        return page;
    }

    public void changePageAction(String page) {
        this.page = page;
    }

//    public List getAnswers() {
//        return answers;
//    }

    //    public TestManagedBean(DataSourse dataSourse) {
//        this.dataSourse = dataSourse;
//        if (! dataSourse.getTestStructMap().isEmpty()) {
//            currentTest = dataSourse.getTestStructMap().get(0);
//        }
//    }


    public DataSourсe getDataSourсe() {
        return dataSourсe;
    }

    public void setDataSourсe(DataSourсe dataSourсe) {
        this.dataSourсe = dataSourсe;
    }

    public TestStruct getCurrentTest() {
        return currentTest;
    }

    public void setCurrentTest(TestStruct currentTest) {
        this.currentTest = currentTest;
    }

    private Object editorText;

    public void setEditorText(Object editorText) {
        this.editorText = editorText;
    }

    public Object getEditorText() {
        return editorText;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public void browseCurrentTest (String title) {
        currentTest = dataSourсe.getTestStructMap().get(title);
        answerList = new ArrayList<>();
        answerMap = new HashMap<>();
    }

    public List<String> getUserAnswerList() {
        return userAnswerList;
    }

    //!!!!!!!!!!
    public void setUserAnswerList(List<String> userAnswerList) {
       // this.answerList.add(new Answer())
        this.userAnswerList = userAnswerList;
    }

    public Map<Long, List<String>> getAnswerMap() {
        return answerMap;
    }

    public void setAnswerMap(Map<Long, List<String>> answerMap) {
        this.answerMap = answerMap;
    }
    public void buttonAction() {

    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}
