package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ReportCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyReportIDTF;
    @javafx.fxml.FXML
    private TableColumn <ReportCustodyOfficer, String>custodyReportTypeCol;
    @javafx.fxml.FXML
    private TextField custodyReportTypeTF;
    @javafx.fxml.FXML
    private DatePicker custodyReportDateDP;
    @javafx.fxml.FXML
    private TableColumn <ReportCustodyOfficer, LocalDate>custodyReportDateCol;
    @javafx.fxml.FXML
    private TableColumn <ReportCustodyOfficer, String>custodyReportIDCol;
    @javafx.fxml.FXML
    private TableView <ReportCustodyOfficer>custodyReportTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void custodyHandleExportPdfForReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleGenerateForReportOA(ActionEvent actionEvent) {
    }
}