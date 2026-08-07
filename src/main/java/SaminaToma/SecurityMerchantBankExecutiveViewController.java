package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SecurityMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TableColumn <SecurityMerchantBankExecutive, String>securityIDColUser7;
    @javafx.fxml.FXML
    private TableColumn <SecurityMerchantBankExecutive, String>companyNameColUser7;
    @javafx.fxml.FXML
    private TextField companyNameTF;
    @javafx.fxml.FXML
    private TextField priceTF;
    @javafx.fxml.FXML
    private TableView <SecurityMerchantBankExecutive>securityTV;
    @javafx.fxml.FXML
    private TableColumn <SecurityMerchantBankExecutive, Float>priceColUser7;
    @javafx.fxml.FXML
    private TableColumn <SecurityMerchantBankExecutive, Integer>quantityColUser7;
    @javafx.fxml.FXML
    private TextField securityIDTF;
    @javafx.fxml.FXML
    private TextField quantityTF;

    @javafx.fxml.FXML
    public void initialize() {
        companyNameColUser7.setCellValueFactory(new PropertyValueFactory<SecurityMerchantBankExecutive,String>("companyName"));
        securityIDColUser7.setCellValueFactory(new PropertyValueFactory<SecurityMerchantBankExecutive,String>("securityId"));
        quantityColUser7.setCellValueFactory(new PropertyValueFactory<SecurityMerchantBankExecutive,Integer>("quantity"));
        priceColUser7.setCellValueFactory(new PropertyValueFactory<SecurityMerchantBankExecutive,Float>("price"));
    }

    @javafx.fxml.FXML
    public void handleSearchForSecurityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleUpdateForSecurityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRefreshForSecurityOA(ActionEvent actionEvent) {
    }
}