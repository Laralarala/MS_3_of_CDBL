package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class TransactionMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TextField accNoTF;
    @javafx.fxml.FXML
    private ComboBox <String>transactionTypeCB;
    @javafx.fxml.FXML
    private DatePicker transactionDateDP;
    @javafx.fxml.FXML
    private TableView <TransactionMerchantBankExecutive>transactionTV;
    @javafx.fxml.FXML
    private TextField transactionIDTF;
    @javafx.fxml.FXML
    private TextField quantityTF;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableColumn <TransactionMerchantBankExecutive, String>transactionIDColUser7;
    @javafx.fxml.FXML
    private TableColumn <TransactionMerchantBankExecutive, Float>amountColUser7;
    @javafx.fxml.FXML
    private TableColumn <TransactionMerchantBankExecutive, Integer>quantityColUser7;
    @javafx.fxml.FXML
    private TableColumn <TransactionMerchantBankExecutive, String>transactionTypeUser17;
    @javafx.fxml.FXML
    private TableColumn <TransactionMerchantBankExecutive, LocalDate>transactionDateColUser7;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleCancleForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSearchForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClearForTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateForTransactionOA(ActionEvent actionEvent) {
    }
}