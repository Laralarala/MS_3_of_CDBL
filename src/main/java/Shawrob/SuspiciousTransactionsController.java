package Shawrob;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class SuspiciousTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn<SuspiciousTransactions , LocalDate> tradeDateTC;
    @javafx.fxml.FXML
    private TableColumn<SuspiciousTransactions , String> typeTC;
    @javafx.fxml.FXML
    private TableView<SuspiciousTransactions> suspiciousTransactionsTV;
    @javafx.fxml.FXML
    private TableColumn<SuspiciousTransactions , Integer> transactionIDTC;
    @javafx.fxml.FXML
    private TableColumn<SuspiciousTransactions , Integer> quantityTC;
    @javafx.fxml.FXML
    private TextField transactionIDTF;
    @javafx.fxml.FXML
    private DatePicker tradeDateDP;
    @javafx.fxml.FXML
    private TextField quantityTF;

    private ObservableList<SuspiciousTransactions> activityList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        tradeDateTC.setCellValueFactory(new PropertyValueFactory<>("tradeDate"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
        transactionIDTC.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        suspiciousTransactionsTV.setItems(activityList);
    }

    @javafx.fxml.FXML
    public void monitorOnAction(ActionEvent actionEvent) {
    }
}