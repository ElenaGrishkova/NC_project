package com.elenagrishkova.edutest;
import com.elenagrishkova.edutest.ejb.DataSourсe;
import com.elenagrishkova.edutest.ejb.TestStruct;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named
@RequestScoped
public class TestManagedBean {
    @Inject
    private DataSourсe dataSourсe;

    private TestStruct currentTest;

    private List answers = new ArrayList();
    private String page = "/WEB-INF/pages/startPage.xhtml";

    public String getPage() {
        return page;
    }

    public void changePageAction(String page) {
        this.page = page;
    }

    public List getAnswers() {
        return answers;
    }

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

    public void browseCurrentTest (String title) {
        currentTest = dataSourсe.getTestStructMap().get(title);
    }
}
