package com.reilem.management.frontend.main;

import com.vaadin.ui.VerticalLayout;

public class MainPresenter {

	private MainUI mainUI;
	private VerticalLayout layout;
	
	public MainPresenter(VerticalLayout layout) {
		this.layout = layout;
		initMainUI();
	}

	private void initMainUI() {
		mainUI = new MainUI();
		mainUI.show(layout);
	}
}
