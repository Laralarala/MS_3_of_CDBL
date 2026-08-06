package MarsiadRahman;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class ComplianceReviewviewController
{
    private ComboBox<String> cmbComplianceType;
    private DatePicker dpAuditDate;
    private TextArea txtAuditCriteria;
    private TextArea txtComplianceReport;


    @javafx.fxml.FXML
    public void initialize() {
        cmbComplianceType.getItems().addAll("Internal", "External", "Regulatory");
    }

    @FXML
    public void reviewOA() {
        txtComplianceReport.setText(
                "Type: " + cmbComplianceType.getValue() +
                        "\nDate: " + dpAuditDate.getValue() +
                        "\nCriteria: " + txtAuditCriteria.getText()
        );
    }

    @FXML
    public void clearOA() {
        cmbComplianceType.setValue(null);
        dpAuditDate.setValue(null);
        txtAuditCriteria.clear();
        txtComplianceReport.clear();
    }

    @FXML
    public void backOA() {
        System.out.println("Back");
    }
}