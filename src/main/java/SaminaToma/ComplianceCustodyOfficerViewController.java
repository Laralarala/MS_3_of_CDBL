package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComplianceCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyAccNoTF;
    @javafx.fxml.FXML
    private ComboBox <String>custodyStatusCmB;
    @javafx.fxml.FXML
    private TableView <ComplianceCustodyOfficer>custodyComplianceTV;
    @javafx.fxml.FXML
    private TableColumn <ComplianceCustodyOfficer, Integer>custodyAccNoCol;
    @javafx.fxml.FXML
    private TableColumn <ComplianceCustodyOfficer, String>custodyStatusCol;
    @javafx.fxml.FXML
    private TextField custodyCompIDTF;
    @javafx.fxml.FXML
    private TableColumn <ComplianceCustodyOfficer, Integer>custodyCompIDCol;

    @javafx.fxml.FXML
    public void initialize() {
        custodyStatusCmB.getItems().addAll("Pending","Under Review","Approved","Rejected");

        custodyCompIDCol.setCellValueFactory(new PropertyValueFactory<ComplianceCustodyOfficer,Integer>("complianceId"));
        custodyAccNoCol.setCellValueFactory(new PropertyValueFactory<ComplianceCustodyOfficer, Integer>("accountNo"));
        custodyStatusCol.setCellValueFactory(new PropertyValueFactory<ComplianceCustodyOfficer, String>("status"));
    }

    @javafx.fxml.FXML
    public void custodyHandleValidateForCompOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleVerifyForCompOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleClearForCompOA(ActionEvent actionEvent) {
    }
}