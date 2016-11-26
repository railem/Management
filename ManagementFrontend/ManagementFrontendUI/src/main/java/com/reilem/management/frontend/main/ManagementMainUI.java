package com.reilem.management.frontend.main;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("reilemTheme")
public class ManagementMainUI extends UI {

	private MainPresenter mainPresenter;
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	VerticalLayout layout = new VerticalLayout();
    	layout.setSizeFull();
    	
    	MainPresenter mainPresenter = new MainPresenter(layout);

    	setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "ManagementMainUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = ManagementMainUI.class, productionMode = false)
    public static class ManagementMainUIServlet extends VaadinServlet {
    }
}
