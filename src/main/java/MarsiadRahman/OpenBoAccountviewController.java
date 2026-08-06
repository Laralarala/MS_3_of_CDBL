package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class OpenBoAccountviewController {

    @FXML private TextField txtHolderId;
    @FXML private TextField txtHolderName;
    @FXML private TextField txtBoAccountNo;
    @FXML private TextField txtPhone;
    @FXML private TextField txtEmail;
    @FXML private TextField txtAddress;
    @FXML private TextField txtNid;
    @FXML private TextArea txtARemarks;
    @FXML private DatePicker dpBirthDate;
    @FXML private ComboBox<String> cmbAccountType;
    @FXML private Button btnCreate;
    @FXML private Button btnClear;
    @FXML private Button btnBack;

    @FXML
    public void initialize() {
        cmbAccountType.getItems().addAll("Individual", "Joint", "Company");
    }

    @FXML
    public void createBoAccountOA(ActionEvent event) {
        System.out.println("Create BO Account Clicked");
        System.out.println("Name: " + txtHolderName.getText());
        System.out.println("ID: " + txtHolderId.getText());

        txtARemarks.setText("Account Created Successfully!");
    }

    @FXML
    public void clearFormOA(ActionEvent event) {
        // Shob field clear
        txtHolderId.clear();
        txtHolderName.clear();
        txtBoAccountNo.clear();
        txtPhone.clear();
        txtEmail.clear();
        txtAddress.clear();
        txtNid.clear();
        txtARemarks.clear();
        dpBirthDate.setValue(null);
        cmbAccountType.setValue(null);
    }

    @FXML
    public void goBackOA(ActionEvent event) {
        System.out.println("Back Button Clicked");
    }
}