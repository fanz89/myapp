/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mif.web.view;

import com.vaadin.navigator.View;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.DateField;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.RadioButtonGroup;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author firdaus
 */
public class SignUpForm extends VerticalLayout implements View {

    private Label labelTitle;
    private Label labelHeader;
    private TextField textUsername;
    private TextField textName;
    private PasswordField textPassword;
    private DateField dateOfbirth;
    private ComboBox comboType;
    private Button buttonConfirm;
    private Button buttonCancel;
    private RadioButtonGroup<String> gropGender;

    public SignUpForm() {
        initComponents();
    }

    private void initComponents() {

        // initial setup
        setSpacing(true);
        setMargin(true);

        // Ui Components
        labelTitle = new Label("Signup Form");
        labelTitle.addStyleName("h1");

        // Setup Form
        FormLayout fLayout = new FormLayout();
        fLayout.setMargin(false);
        fLayout.setWidth("700");
        fLayout.addStyleName("light");
        addComponent(fLayout);

        labelHeader = new Label("Personal Information");
        labelHeader.addStyleName("h2");
        labelHeader.addStyleName("colored");
        fLayout.addComponent(labelHeader);

        textName = new TextField("Name");
        textName.setRequiredIndicatorVisible(true);
        fLayout.addComponent(textName);

        textUsername = new TextField("Username");
        textUsername.setRequiredIndicatorVisible(true);
        fLayout.addComponent(textUsername);

        textPassword = new PasswordField("Password");
        textPassword.setRequiredIndicatorVisible(true);
        fLayout.addComponent(textPassword);

        dateOfbirth = new DateField("Date Of Birth");
        dateOfbirth.setRequiredIndicatorVisible(true);
        dateOfbirth.setDateFormat("dd-MM-yyyy");
        dateOfbirth.setValue(LocalDate.now());
        fLayout.addComponent(dateOfbirth);

        gropGender = new RadioButtonGroup<>("Gender");
        gropGender.setItems("Male", "Female");
        gropGender.addStyleName("horizontal");
        fLayout.addComponent(gropGender);

        ArrayList<String> list = new ArrayList<>();
        list.add("Student");
        list.add("Staff");

        comboType = new ComboBox("Type", list);
        comboType.setRequiredIndicatorVisible(true);
        fLayout.addComponent(comboType);
        
        buttonConfirm = new Button("Confirm");
        buttonConfirm.addStyleName("primary");

        buttonCancel = new Button("Cancel");
        buttonCancel.addStyleName("danger");

        // horizontal footer from buttons
        HorizontalLayout footer = new HorizontalLayout();
        // set margin for top and bottom
        footer.setMargin(new MarginInfo(true, false, true, false)); 
        footer.setSpacing(true);
        footer.setDefaultComponentAlignment(Alignment.MIDDLE_LEFT);
        footer.addComponent(buttonConfirm, 0);
        footer.addComponent(buttonCancel, 1);
        fLayout.addComponent(footer);
        
    }

}
