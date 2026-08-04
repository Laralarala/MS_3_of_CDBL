package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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