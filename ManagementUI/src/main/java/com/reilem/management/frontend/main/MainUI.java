package com.reilem.management.frontend.main;

import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class MainUI {

	private VerticalLayout applicationLayout;
	
	public void show(VerticalLayout layout) {
    	applicationLayout = layout;
    	
    	applicationLayout.addComponent(new Label("HELLO WORLD"));
	}
}
