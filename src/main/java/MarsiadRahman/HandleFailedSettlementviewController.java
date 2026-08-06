package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HandleFailedSettlementviewController {

    @FXML private TextField txtTransactionID;
    @FXML private TextArea txtAFailureReason;
    @FXML private TextArea txtAActionTaken;
    @FXML private ComboBox<String> cmbSettlementStatus;
    @FXML private Button btnRecordFailure;
    @FXML private Button btnClear;
    @FXML private Button btnBack;

    @FXML
    public void initialize() {
        cmbSettlementStatus.getItems().addAll("Pending", "Resolved", "Escalated");
    }

    @FXML
    public void backOA(ActionEvent event) {
        System.out.println("Back button clicked");
    }

    @FXML
    public void clearOA(ActionEvent event) {
        // Shob clear kore dibe
        txtTransactionID.clear();
        txtAFailureReason.clear();
        txtAActionTaken.clear();
        cmbSettlementStatus.setValue(null);
    }

    @FXML
    public void recordfailureOA(ActionEvent event) {
        System.out.println("Record Failure Clicked");
        System.out.println("ID: " + txtTransactionID.getText());
    }
}