package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class SecurityCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TableColumn <SecurityCustodyOfficer, String>custodyCompanyNameCol;
    @javafx.fxml.FXML
    private TableColumn <SecurityCustodyOfficer, Integer>custodyQuantityCol;
    @javafx.fxml.FXML
    private TextField custodySecurityIDTF;
    @javafx.fxml.FXML
    private TextField custodyQuantityTF;
    @javafx.fxml.FXML
    private TableView <SecurityCustodyOfficer>custodySecurityTV;
    @javafx.fxml.FXML
    private TableColumn <SecurityCustodyOfficer, String>custodySecurityIDCol;
    @javafx.fxml.FXML
    private TextField custodyPriceTF;
    @javafx.fxml.FXML
    private TextField custodyCompanyNameTF;
    @javafx.fxml.FXML
    private TableColumn <SecurityCustodyOfficer, Float>custodyPriceCol;

    @javafx.fxml.FXML
    public void initialize() {
        custodySecurityIDCol.setCellValueFactory(new PropertyValueFactory<SecurityCustodyOfficer,String>("securityId"));
        custodyCompanyNameCol.setCellValueFactory(new PropertyValueFactory<SecurityCustodyOfficer,String>("companyName"));
        custodyQuantityCol.setCellValueFactory(new PropertyValueFactory<SecurityCustodyOfficer,Integer>("quantity"));
        custodyPriceCol.setCellValueFactory(new PropertyValueFactory<SecurityCustodyOfficer,Float>("price"));
    }

    @javafx.fxml.FXML
    public void custodyHandleUpdateForSecurityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleSearchForSecurityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleRefreshForSecurityOA(ActionEvent actionEvent) {
    }
}