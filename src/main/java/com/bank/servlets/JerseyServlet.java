package com.bank.servlets;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;


/**
 * Created by bobyk on 11/28/17.
 */
public class JerseyServlet extends ServletContainer {

    public JerseyServlet() {

    }

    public JerseyServlet(ResourceConfig config) {
        super(config);
    }
}

