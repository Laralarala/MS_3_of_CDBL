package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ApproveTransactionMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, String>transactionIDColUser7;
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, Float>amountColUser7;
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, Integer>accNumColUser7;
    @javafx.fxml.FXML
    private TextField approvalRemarksTF;
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, LocalDate>transactionDateColUser7;
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, String>transactionTypeColUser7;
    @javafx.fxml.FXML
    private TableColumn <ApproveTransactionMerchantBankExecutive, String>statusColUser7;
    @javafx.fxml.FXML
    private TableView <ApproveTransactionMerchantBankExecutive>approveTransactionTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleApproveForApproveTransactionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleBackForApproveTransactionOA(ActionEvent actionEvent) {
    }
}