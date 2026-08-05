package com.example.ms_3_of_cdbl;

import com.example.ms_3_of_cdbl.Utilities.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class UserLogin
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField userIdTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginOnActionButton(ActionEvent actionEvent) {
        String UserID = userIdTextfield.getText();
        String password = passwordTextField.getText();
        SceneSwitcher.switchScene(actionEvent,"/userDashboard.fxml","userDashboard");
    }
}