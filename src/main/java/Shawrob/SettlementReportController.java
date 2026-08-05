package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class SettlementReportController
{

    @javafx.fxml.FXML
    private TableView<SettlementReport> settlementReportTV;
    @javafx.fxml.FXML
    private TableColumn<SettlementReport , Integer> reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableColumn<SettlementReport , String> reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn<SettlementReport , LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<SettlementReport , String> fileFormatTC;
    @javafx.fxml.FXML
    private TextField reportTypeTF;
    @javafx.fxml.FXML
    private TextField reportIdTF;

    @javafx.fxml.FXML
    public void initialize() {

        reportIDTC.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        reportTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("generateDate"));
        fileFormatTC.setCellValueFactory(new PropertyValueFactory<>("fileFormat"));
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}