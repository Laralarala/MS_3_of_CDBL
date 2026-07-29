package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HandleFailedSettlementviewController
{
    @javafx.fxml.FXML
    private TextField txtTransactionID;
    @javafx.fxml.FXML
    private Button btnBack;
    @javafx.fxml.FXML
    private TextArea txtAFailureReason;
    @javafx.fxml.FXML
    private Button btnRecordFailure;
    @javafx.fxml.FXML
    private TextArea txtAActionTaken;
    @javafx.fxml.FXML
    private ComboBox cmbSettlementStatus;
    @javafx.fxml.FXML
    private Button btnClear;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clearOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordfailureOA(ActionEvent actionEvent) {
    }
}