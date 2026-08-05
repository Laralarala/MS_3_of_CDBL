package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableColumn<BOActivity , Integer> quantityTC;
    @javafx.fxml.FXML
    private TextField accountNoTF;
    @javafx.fxml.FXML
    private TableColumn<BOActivity , Integer> accountNoTC;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private DatePicker tradeDateDP;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {

        typeCB.getItems().addAll("Buy" , "Sell" , "Deposit" , "Transfer");
        accountNoTC.setCellValueFactory(new PropertyValueFactory<>("accountNo"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        priceTC.setCellValueFactory(new PropertyValueFactory<>("price"));
        tradeDateTC.setCellValueFactory(new PropertyValueFactory<>("tradeDate"));
        typeTC.setCellValueFactory(new PropertyValueFactory<>("type"));
    }

    @javafx.fxml.FXML
    public void searchOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportOnAction(ActionEvent actionEvent) {
    }
}