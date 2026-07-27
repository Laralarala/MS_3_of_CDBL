package Shawrob;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CorporateActionController
{
    @javafx.fxml.FXML
    private TableView corporateActionTV;
    @javafx.fxml.FXML
    private TableColumn reportIDTC;
    @javafx.fxml.FXML
    private DatePicker generateDateDP;
    @javafx.fxml.FXML
    private TableColumn reportTypeTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableColumn fileFormatTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
    }
}