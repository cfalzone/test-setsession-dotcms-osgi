package com.aquent.test;

import com.dotmarketing.osgi.GenericBundleActivator;
import org.osgi.framework.BundleContext;

public class SetSessionActivator extends GenericBundleActivator {

    @Override
    public void start ( BundleContext bundleContext ) throws Exception {

        //Initializing services...
        initializeServices( bundleContext );

        //Registering the ViewTool service
        registerViewToolService( bundleContext, new SetSessionToolInfo() );
    }

    @Override
    public void stop ( BundleContext bundleContext ) throws Exception {
        unregisterViewToolServices();
    }

}
