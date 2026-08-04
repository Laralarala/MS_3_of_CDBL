package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class RecordsMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TextField recordIDTF;
    @javafx.fxml.FXML
    private TableColumn <RecordsMerchantBankExecutive, String>clientNameColUser7;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TableColumn <RecordsMerchantBankExecutive, LocalDate>dateOfBirthColUser7;
    @javafx.fxml.FXML
    private TableColumn <RecordsMerchantBankExecutive, Integer>accountNumberColUser7;
    @javafx.fxml.FXML
    private TableColumn <RecordsMerchantBankExecutive, String>clientIDColUser7;
    @javafx.fxml.FXML
    private TableView <RecordsMerchantBankExecutive>recordsTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleUpdatedDataForRecordsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleClearForRecordsOA(ActionEvent actionEvent) {
    }
}