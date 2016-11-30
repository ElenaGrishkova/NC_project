package com.elenagrishkova.edutest;
import com.elenagrishkova.edutest.ejb.DataSourse;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;



@Named
@RequestScoped
public class TestManagedBean {

    @Inject
    private DataSourse dataSourse;

}
