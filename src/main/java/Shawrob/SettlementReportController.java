package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}