package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ReportCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyReportIDTF;
    @javafx.fxml.FXML
    private TableColumn custodyReportTypeCol;
    @javafx.fxml.FXML
    private TextField custodyReportTypeTF;
    @javafx.fxml.FXML
    private DatePicker custodyReportDateDP;
    @javafx.fxml.FXML
    private TableColumn custodyReportDateCol;
    @javafx.fxml.FXML
    private TableColumn custodyReportIDCol;
    @javafx.fxml.FXML
    private TableView custodyReportTV;

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