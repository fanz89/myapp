/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mif.web.view;

import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 *
 * @author firdaus
 */
public class Login extends VerticalLayout implements View {

    private TextField username;
    private PasswordField password;
    private Button btnLogin;
    private Button btnSignup;

    public Login() {
        initComponents();
        initEvent();
    }

    private void initComponents() {
        // UI Elements        
        username = new PasswordField("Username");
        password = new PasswordField("Password");

        // Add horizontal layout from button
        HorizontalLayout hLayout = new HorizontalLayout();

        // UI Elements Buttons
        btnLogin = new Button("Login");
        btnLogin.addStyleName("friendly");

        btnSignup = new Button("Signup");
        btnSignup.addStyleName("primary");

        hLayout.addComponent(btnLogin);
        hLayout.addComponent(btnSignup);

        hLayout.setSpacing(true);

        // Form Layout
        FormLayout fLayout = new FormLayout(username, password, hLayout);
        fLayout.setMargin(true);

        Panel loginPanel = new Panel("Peer Revies System", fLayout);
        loginPanel.setWidth("450");
        loginPanel.setHeight("250");

        // Add Components        
        addComponent(loginPanel);
        setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
        setHeight("100%");

    }

    private void initEvent() {

        btnLogin.addClickListener((Button.ClickEvent event) -> {

        });

        btnSignup.addClickListener((Button.ClickEvent event) -> {
               getUI().getNavigator().navigateTo("signup");
        });

    }

}
