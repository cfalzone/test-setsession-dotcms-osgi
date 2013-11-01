package com.aquent.test;

import org.apache.velocity.tools.view.context.ViewContext;
import org.apache.velocity.tools.view.servlet.ServletToolInfo;

public class SetSessionToolInfo extends ServletToolInfo {

    @Override
    public String getKey () {
        return "testset";
    }

    @Override
    public String getScope () {
        return ViewContext.APPLICATION;
    }

    @Override
    public String getClassname () {
        return SetSessionTool.class.getName();
    }

    @Override
    public Object getInstance ( Object initData ) {

        SetSessionTool viewTool = new SetSessionTool();
        viewTool.init( initData );

        setScope( ViewContext.APPLICATION );

        return viewTool;
    }

}
