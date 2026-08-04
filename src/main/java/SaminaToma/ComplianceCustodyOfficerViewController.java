package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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