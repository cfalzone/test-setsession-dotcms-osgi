package com.aquent.test;

import javax.servlet.http.HttpServletRequest;

import org.apache.velocity.tools.view.tools.ViewTool;

import com.aquent.testobjects.TestObject;

public class SetSessionTool implements ViewTool {
    
    public void init(Object initData) { }
    
    public void setInSession(HttpServletRequest request, String text) {
    	TestObject t = new TestObject();
    	t.setTest(text);
    	request.getSession().setAttribute("testObject", t);
    }
    

}
