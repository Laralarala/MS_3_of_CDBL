package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SuspiciousTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn priceTC;
    @javafx.fxml.FXML
    private TableColumn tradeDateTC;
    @javafx.fxml.FXML
    private TableColumn typeTC;
    @javafx.fxml.FXML
    private DatePicker toDateDP;
    @javafx.fxml.FXML
    private DatePicker fromDateDP;
    @javafx.fxml.FXML
    private TableView suspiciousTransactionsTV;
    @javafx.fxml.FXML
    private TableColumn transactionIDTC;
    @javafx.fxml.FXML
    private TableColumn securityNameTC;
    @javafx.fxml.FXML
    private TableColumn quantityTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void monitorOnAction(ActionEvent actionEvent) {
    }
}