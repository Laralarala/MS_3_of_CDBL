package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class AuditTrailController
{

    @javafx.fxml.FXML
    private TableView<AuditTrail> auditTrailTV;
    @javafx.fxml.FXML
    private TableColumn<AuditTrail , Integer> reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableColumn<AuditTrail , String> reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn<AuditTrail , LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<AuditTrail , String> fileFormatTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}