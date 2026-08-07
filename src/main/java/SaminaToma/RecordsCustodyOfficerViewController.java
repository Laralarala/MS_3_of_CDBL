package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class RecordsCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TextField custodyEmailTF;
    @javafx.fxml.FXML
    private TableColumn <RecordsCustodyOfficer, LocalDate>custodyDateOfBirthCol;
    @javafx.fxml.FXML
    private TextField custodyClientIDTF;
    @javafx.fxml.FXML
    private TextField custodyAccNumTF;
    @javafx.fxml.FXML
    private DatePicker custodyDateOfBirthDP;
    @javafx.fxml.FXML
    private TableColumn <RecordsCustodyOfficer, String>custodyClientNameCol;
    @javafx.fxml.FXML
    private TableColumn <RecordsCustodyOfficer, Integer>custodyAccNumCol;
    @javafx.fxml.FXML
    private TextField custodyClientNameTF;
    @javafx.fxml.FXML
    private TableColumn <RecordsCustodyOfficer, String>custodyClientIDCol;
    @javafx.fxml.FXML
    private TableView <RecordsCustodyOfficer>custodyRecordsTV;

    @javafx.fxml.FXML
    public void initialize() {
        custodyClientIDCol.setCellValueFactory(new PropertyValueFactory<RecordsCustodyOfficer,String>("clientId"));
        custodyClientNameCol.setCellValueFactory(new PropertyValueFactory<RecordsCustodyOfficer,String>("clientName"));
        custodyAccNumCol.setCellValueFactory(new PropertyValueFactory<RecordsCustodyOfficer,Integer>("accountNumber"));
        custodyDateOfBirthCol.setCellValueFactory(new PropertyValueFactory<RecordsCustodyOfficer,LocalDate>("dateOfBirth"));
    }

    @javafx.fxml.FXML
    public void custodyHandleClearForRecordsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleUpdatedDataForRecordsOA(ActionEvent actionEvent) {
    }
}