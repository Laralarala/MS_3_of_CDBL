package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AccountCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TableColumn <AccountCustodyOfficer, String>custodyAccNameCol;
    @javafx.fxml.FXML
    private TextField custodyBalanceTF;
    @javafx.fxml.FXML
    private TableColumn <AccountCustodyOfficer, String>custodyHolderNameCol;
    @javafx.fxml.FXML
    private ComboBox <String> custodyStatusCmB;
    @javafx.fxml.FXML
    private TableView <AccountCustodyOfficer>custodyAccTV;
    @javafx.fxml.FXML
    private TextField custodyAccNameTF;
    @javafx.fxml.FXML
    private TableColumn <AccountCustodyOfficer, String>custodyAccIDCol;
    @javafx.fxml.FXML
    private TextField custodyHolderNameTF;
    @javafx.fxml.FXML
    private TextField custodyAccIDTF;
    @javafx.fxml.FXML
    private TableColumn <AccountCustodyOfficer, String>custodyStatusCol;

    @javafx.fxml.FXML
    public void initialize() {
        custodyStatusCmB.getItems().addAll("Active","Inactive","Suspended","Closed");

        custodyAccIDCol.setCellValueFactory(new PropertyValueFactory<AccountCustodyOfficer, String>("accountId"));
        custodyAccNameCol.setCellValueFactory(new PropertyValueFactory<AccountCustodyOfficer, String>("accountName"));
        custodyHolderNameCol.setCellValueFactory(new PropertyValueFactory<AccountCustodyOfficer, String>("holderName"));
        custodyStatusCol.setCellValueFactory(new PropertyValueFactory<AccountCustodyOfficer, String>("status"));
    }

    @javafx.fxml.FXML
    public void custodyHandleSearchForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleDeleteForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleUpdateForAccOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleCreateForAccOA(ActionEvent actionEvent) {
    }
}