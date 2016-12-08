package com.elenagrishkova.edutest;
import com.elenagrishkova.edutest.ejb.DataSourse;
import com.elenagrishkova.edutest.ejb.TestStruct;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class TestManagedBean {
    @Inject
    private DataSourse dataSourse;

    private TestStruct currentTest;


//    public TestManagedBean(DataSourse dataSourse) {
//        this.dataSourse = dataSourse;
//        if (! dataSourse.getTestStructMap().isEmpty()) {
//            currentTest = dataSourse.getTestStructMap().get(0);
//        }
//    }


    public DataSourse getDataSourse() {
        return dataSourse;
    }

    public void setDataSourse(DataSourse dataSourse) {
        this.dataSourse = dataSourse;
    }



    public TestStruct getCurrentTest() {
        return currentTest;
    }

    public void setCurrentTest(TestStruct currentTest) {
        this.currentTest = currentTest;
    }

    //    private Object editorText;
//
//    public void setEditorText(Object editorText) {
//        this.editorText = editorText;
//    }
//
//    public Object getEditorText() {
//        return editorText;
//    }

    public void browseCurrentTest (String title) {
        currentTest = dataSourse.getTestStructMap().get(title);
    }
}
