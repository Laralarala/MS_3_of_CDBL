package MarsiadRahman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;



public class GenerateSettlementReportviewController {

    @FXML
    private TextArea txtAReportDetails;
    @FXML
    private Button btnBack;
    @FXML
    private DatePicker dpReportPeriod;
    @FXML
    private Button btnGenerateReport;
    @FXML
    private Button btnClear;
    @FXML
    private ComboBox<String> cmbReportType;

    @FXML
    public void initialize() {
        cmbReportType.getItems().addAll(
                "Daily Report",
                "Weekly Report",
                "Monthly Report"
        );
    }

    @FXML
    public void backOA(ActionEvent event) {
        System.out.println("Back Button Clicked");
    }

    @FXML
    public void generateReportOA(ActionEvent event) {
        System.out.println("Generate Report Clicked");
    }

    @FXML
    public void clearOA(ActionEvent event) {
        cmbReportType.setValue(null);
        dpReportPeriod.setValue(null);
        txtAReportDetails.clear();
    }
}