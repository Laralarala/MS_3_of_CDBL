package MarsiadRahman;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class SecuritiesSettlementview {

    @FXML private Label lblStatusMessage;
    @FXML private Button btnBack;
    @FXML private TextField txtSecurityID;
    @FXML private ComboBox <String> cmbSettlementstatus;
    @FXML private TextField txtSettlementRequestId;
    @FXML private TextField txtQuantity;
    @FXML private Button btnClear;
    @FXML private Button btnComplete;

    @FXML
    public void initialize() {
        cmbSettlementstatus.getItems().addAll("Pending", "Completed", "Failed");

    }

    @FXML
    public void completeOA(ActionEvent actionEvent) {
        lblStatusMessage.setText("Complete");
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        lblStatusMessage.setText("Back");
    }

    @FXML
    public void clearOA(ActionEvent actionEvent) {
        txtSecurityID.clear();
        txtSettlementRequestId.clear();
        txtQuantity.clear();
        lblStatusMessage.setText("Clear");
    }
}