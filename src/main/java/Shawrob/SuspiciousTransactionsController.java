package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SuspiciousTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn tradeDateTC;
    @javafx.fxml.FXML
    private TableColumn typeTC;
    @javafx.fxml.FXML
    private TableView suspiciousTransactionsTV;
    @javafx.fxml.FXML
    private TableColumn transactionIDTC;
    @javafx.fxml.FXML
    private TableColumn quantityTC;
    @javafx.fxml.FXML
    private TextField transactionIDTF;
    @javafx.fxml.FXML
    private DatePicker tradeDateDP;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void monitorOnAction(ActionEvent actionEvent) {
    }
}