package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class TransactionCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyAccNoTF;
    @javafx.fxml.FXML
    private TableColumn <TransactionCustodyOfficer, Integer>custodyQuantityCol;
    @javafx.fxml.FXML
    private TextField custodyTransactionIDTF;
    @javafx.fxml.FXML
    private DatePicker custodyTransactionDateDP;
    @javafx.fxml.FXML
    private TableColumn <TransactionCustodyOfficer,String>custodyTransactionTypeCol;
    @javafx.fxml.FXML
    private TextField custodyQuantityTF;
    @javafx.fxml.FXML
    private TableColumn <TransactionCustodyOfficer, String>custodyTransactionIDCol;
    @javafx.fxml.FXML
    private TableColumn <TransactionCustodyOfficer, Float>custodyAmountCol;
    @javafx.fxml.FXML
    private TableColumn <TransactionCustodyOfficer, LocalDate>custodyTransactionDateCol;
    @javafx.fxml.FXML
    private TableView <TransactionCustodyOfficer>custodyTransactionTV;
    @javafx.fxml.FXML
    private ComboBox <String>custodyTransactionTypeCmB;
    @javafx.fxml.FXML
    private TextField custodyAmountTF;

    @javafx.fxml.FXML
    public void initialize() {
        custodyTransactionTypeCmB.getItems().addAll("Deposit","Withdrawal","Transfer","Buy","Sell");

        custodyTransactionIDCol.setCellValueFactory(new PropertyValueFactory<TransactionCustodyOfficer,String>("transactionId"));
        custodyTransactionTypeCol.setCellValueFactory(new PropertyValueFactory<TransactionCustodyOfficer,String>("transactionType"));
        custodyTransactionDateCol.setCellValueFactory(new PropertyValueFactory<TransactionCustodyOfficer,LocalDate>("transactionDate"));
        custodyQuantityCol.setCellValueFactory(new PropertyValueFactory<TransactionCustodyOfficer,Integer>("quantity"));
        custodyAmountCol.setCellValueFactory(new PropertyValueFactory<TransactionCustodyOfficer,Float>("amount"));
    }

    @javafx.fxml.FXML
    public void custodyHandleClearForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleSearchForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleCancleForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleUpdateForTransactionOA(ActionEvent actionEvent) {
    }
}