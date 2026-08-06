package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MonitorSettlementStatusviewController {

    @FXML private TextField txtSettlementBatchID;
    @FXML private ComboBox<String> cmbSettlementStatus;
    @FXML private DatePicker dpLastUpdated;
    @FXML private TextArea txtAStatusDetails;
    @FXML private Button btnSearch;
    @FXML private Button btnUpdateStatus;
    @FXML private Button btnClear;
    @FXML private Button btnBack;

    @FXML
    public void initialize() {

        cmbSettlementStatus.getItems().addAll("Pending", "Completed", "Failed");
    }

    @FXML
    public void searchOA(ActionEvent event) {
        String batchID = txtSettlementBatchID.getText();
        txtAStatusDetails.setText("Searching for Batch ID: " + batchID);
    }

    @FXML
    public void updatestatusOA(ActionEvent event) {
        String status = cmbSettlementStatus.getValue();
        txtAStatusDetails.setText("Status Updated to: " + status);
    }

    @FXML
    public void clearOA(ActionEvent event) {
        // Shob clear
        txtSettlementBatchID.clear();
        txtAStatusDetails.clear();
        cmbSettlementStatus.setValue(null);
        dpLastUpdated.setValue(null);
    }

    @FXML
    public void backOA(ActionEvent event) {
        System.out.println("Back Button Clicked");
    }
}