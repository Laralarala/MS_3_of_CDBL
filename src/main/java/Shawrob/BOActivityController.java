package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class BOActivityController
{

    @javafx.fxml.FXML
    private TableColumn<BOActivity , Float> priceTC;
    @javafx.fxml.FXML
    private TableColumn<BOActivity , LocalDate> tradeDateTC;
    @javafx.fxml.FXML
    private TableView<BOActivity> boActivityTV;
    @javafx.fxml.FXML
    private TableColumn<BOActivity , String> typeTC;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableColumn<BOActivity , String> securityNameTC;
    @javafx.fxml.FXML
    private TableColumn<BOActivity , Integer> quantityTC;
    @javafx.fxml.FXML
    private TextField accountNoTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportOnAction(ActionEvent actionEvent) {
    }
}