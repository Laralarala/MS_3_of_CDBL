package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class CorporateActionController
{
    @javafx.fxml.FXML
    private TableView<CorporateAction> corporateActionTV;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , Integer> reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , String> reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , LocalDate> dateTC;
    @javafx.fxml.FXML
    private TableColumn<CorporateAction , String> fileFormatTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}