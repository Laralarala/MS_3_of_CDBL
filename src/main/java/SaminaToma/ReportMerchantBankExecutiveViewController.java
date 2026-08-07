package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ReportMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TextField reportTypeTF;
    @javafx.fxml.FXML
    private TableColumn <ReportMerchantBankExecutive, String>reportIDColUser7;
    @javafx.fxml.FXML
    private TextField reportIDTF;
    @javafx.fxml.FXML
    private TableColumn <ReportMerchantBankExecutive, LocalDate>reportDateColUser7;
    @javafx.fxml.FXML
    private DatePicker reportDateDP;
    @javafx.fxml.FXML
    private TableView <ReportMerchantBankExecutive>reportTV;
    @javafx.fxml.FXML
    private TableColumn <ReportMerchantBankExecutive, String>reportTypeColUser7;

    @javafx.fxml.FXML
    public void initialize() {
        reportDateColUser7.setCellValueFactory(new PropertyValueFactory<ReportMerchantBankExecutive,LocalDate>("reportDate"));
        reportIDColUser7.setCellValueFactory(new PropertyValueFactory<ReportMerchantBankExecutive,String>("reportId"));
        reportTypeColUser7.setCellValueFactory(new PropertyValueFactory<ReportMerchantBankExecutive,String>("reportType"));
    }

    @javafx.fxml.FXML
    public void handleGenerateForReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportForReportOA(ActionEvent actionEvent) {
    }
}