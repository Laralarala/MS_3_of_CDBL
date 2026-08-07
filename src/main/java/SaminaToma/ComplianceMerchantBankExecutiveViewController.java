package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComplianceMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TextField accNoTF;
    @javafx.fxml.FXML
    private TableColumn <ComplianceMerchantBankExecutive, Integer>compIDColUser7;
    @javafx.fxml.FXML
    private TextField compIDTF;
    @javafx.fxml.FXML
    private TableColumn<ComplianceMerchantBankExecutive, Integer> accNoColUser7;
    @javafx.fxml.FXML
    private TableView <ComplianceMerchantBankExecutive>complianceTV;
    @javafx.fxml.FXML
    private TableColumn <ComplianceMerchantBankExecutive, String>statusColUser7;
    @javafx.fxml.FXML
    private ComboBox <String>statusCmB;

    @javafx.fxml.FXML
    public void initialize() {
        statusCmB.getItems().addAll("Pending","Under Review","Approved","Rejected");

        accNoColUser7.setCellValueFactory(new PropertyValueFactory<ComplianceMerchantBankExecutive,Integer>("accountNo"));
        compIDColUser7.setCellValueFactory(new PropertyValueFactory<ComplianceMerchantBankExecutive,Integer>("complianceId"));
        statusColUser7.setCellValueFactory(new PropertyValueFactory<ComplianceMerchantBankExecutive,String>("status"));
    }

    @javafx.fxml.FXML
    public void handleClearForComplianceOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleValidateForComplianceOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerifyForComplianceOA(ActionEvent actionEvent) {
    }
}