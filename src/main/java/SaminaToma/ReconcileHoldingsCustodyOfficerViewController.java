package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReconcileHoldingsCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyHoldingIDTF;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, String>custodyHoldingIDCol;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, Integer>custodyQuantityCol;
    @javafx.fxml.FXML
    private TextField custodySecurityIDTF;
    @javafx.fxml.FXML
    private TextField custodyAccNumTF;
    @javafx.fxml.FXML
    private TextField custodyQuantityTF;
    @javafx.fxml.FXML
    private ComboBox <String>custodyStatusCmB;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, String>custodySecurityIDCol;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, String>custodyStatusCol;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, String>custodySecurityNameCol;
    @javafx.fxml.FXML
    private TableColumn <ReconcileHoldingsCustodyOfficer, Integer>custodyAccNumCol;
    @javafx.fxml.FXML
    private TableView <ReconcileHoldingsCustodyOfficer>custodyReconcileHoldsTV;
    @javafx.fxml.FXML
    private TextField custodySecurityNameTF;

    @javafx.fxml.FXML
    public void initialize() {
        custodyStatusCmB.getItems().addAll("Matched","Mismatch","Pending","Reconciled");

        custodySecurityIDCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, String>("securityId"));
        custodyHoldingIDCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, String>("holdingId"));
        custodySecurityNameCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, String>("securityName"));
        custodyAccNumCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, Integer>("accountNumber"));
        custodyQuantityCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, Integer>("quantity"));
        custodyStatusCol.setCellValueFactory(new PropertyValueFactory<ReconcileHoldingsCustodyOfficer, String>("status"));
    }

    @javafx.fxml.FXML
    public void custodyHandleReconcileForReconcileHoldsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleSaveForReconcileHoldsOA(ActionEvent actionEvent) {
    }
}