package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class UpdateProfileviewController {

    @FXML private ComboBox<String> comboGender;
    @FXML private TextField txtUserID;
    @FXML private TextField txtFullName;
    @FXML private TextField txtAddress;
    @FXML private TextField txtEmail;
    @FXML private TextField txtNID;

    @FXML
    public void initialize() {

        comboGender.getItems().addAll("Male", "Female", "Other");
    }

    @FXML
    public void blackOA(ActionEvent event) {
        System.out.println("Back Button Clicked");
    }

    @FXML
    public void updateprofileOA(ActionEvent event) {
        System.out.println("Update Profile Clicked");
        System.out.println("Name: " + txtFullName.getText());
        System.out.println("Gender: " + comboGender.getValue());
    }

    @FXML
    public void clearOA(ActionEvent event) {
        // Shob field clear
        txtUserID.clear();
        txtFullName.clear();
        txtAddress.clear();
        txtEmail.clear();
        txtNID.clear();
        comboGender.setValue(null);
    }
}