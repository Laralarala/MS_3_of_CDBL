package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CorporateActionController
{
    @javafx.fxml.FXML
    private TableView<CorporateAction> corporateActionTV;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , Integer> reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , String> reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , String> fileFormatTC;
    @javafx.fxml.FXML
    private TextField reportTypeTF;
    @javafx.fxml.FXML
    private TextField reportIDTF;

    @javafx.fxml.FXML
    public void initialize() {

        reportIDTC.setCellValueFactory(new PropertyValueFactory<>("reportID"));
        reportTypeTC.setCellValueFactory(new PropertyValueFactory<>("reportType"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("generateDate"));
        fileFormatTC.setCellValueFactory(new PropertyValueFactory<>("fileFormat"));
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}