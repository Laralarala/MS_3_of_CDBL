package RafadinIslam_2111525;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class FilterSubscriptionByActiveOrExpired
{
    @javafx.fxml.FXML
    private ComboBox activeOrExpiredComboBox;
    @javafx.fxml.FXML
    private TableColumn ExpiredTableCol;
    @javafx.fxml.FXML
    private TableView filterSubscriptionTableView;
    @javafx.fxml.FXML
    private TableColumn activeTableCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterSubscriptionButtonOnAction(ActionEvent actionEvent) {
    }
}