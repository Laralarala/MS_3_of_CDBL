package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AccountMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TextField accNameTF;
    @javafx.fxml.FXML
    private TextField holderNameTF;
    @javafx.fxml.FXML
    private TextField balanceTF;
    @javafx.fxml.FXML
    private TableView <AccountMerchantBankExecutive>accountTV;
    @javafx.fxml.FXML
    private ComboBox <String>statusCB;
    @javafx.fxml.FXML
    private TextField accIDTF;
    @javafx.fxml.FXML
    private TableColumn <AccountMerchantBankExecutive, Integer>accIDColUser7;
    @javafx.fxml.FXML
    private TableColumn <AccountMerchantBankExecutive, Float>balanceColUser7;
    @javafx.fxml.FXML
    private TableColumn <AccountMerchantBankExecutive, String>accNameColUser7;
    @javafx.fxml.FXML
    private TableColumn <AccountMerchantBankExecutive, String>statusColUser7;

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Active","Pending","Approved","Rejected","Closed");

        accIDColUser7.setCellValueFactory(new PropertyValueFactory<AccountMerchantBankExecutive, Integer>("accountId"));
        accNameColUser7.setCellValueFactory(new PropertyValueFactory<AccountMerchantBankExecutive, String>("accountName"));
        balanceColUser7.setCellValueFactory(new PropertyValueFactory<AccountMerchantBankExecutive, Float>("balance"));
        statusColUser7.setCellValueFactory(new PropertyValueFactory<AccountMerchantBankExecutive, String>("status"));
    }

    @javafx.fxml.FXML
    public void handleSearchForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCreateForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleDeleteForAccOA(ActionEvent actionEvent) {
    }
}