package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DailySummaryController
{
    @javafx.fxml.FXML
    private TableColumn<DailySummary , Integer> reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableView<DailySummary> dailySummaryTV;
    @javafx.fxml.FXML
    private TableColumn<DailySummary , String> reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn<DailySummary , LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<DailySummary , String> statusTC;
    @javafx.fxml.FXML
    private TextField reportTypeTF;
    @javafx.fxml.FXML
    private TextField reportIDTF;

    @javafx.fxml.FXML
    public void initialize() {

        reportIDTC.setCellValueFactory(new PropertyValueFactory<>("reportID"));
        reportTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("generateDate"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportOnAction(ActionEvent actionEvent) {
    }
}