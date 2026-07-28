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
    private ComboBox custodyStatusCmB;
    @javafx.fxml.FXML
    private TableView custodyComplianceTV;
    @javafx.fxml.FXML
    private TableColumn custodyAccNoCol;
    @javafx.fxml.FXML
    private TableColumn custodyStatusCol;
    @javafx.fxml.FXML
    private TextField custodyCompIDTF;
    @javafx.fxml.FXML
    private TableColumn custodyCompIDCol;

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