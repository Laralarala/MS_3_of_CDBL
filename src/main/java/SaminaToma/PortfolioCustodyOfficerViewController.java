package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PortfolioCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private TableColumn <PortfolioCustodyOfficer,String>custodyPortfolioIDCol;
    @javafx.fxml.FXML
    private TableColumn <PortfolioCustodyOfficer, Float>custodyTotalValueCol;
    @javafx.fxml.FXML
    private TableColumn <PortfolioCustodyOfficer, Integer>custodyQuantityCol;
    @javafx.fxml.FXML
    private TextField custodyAccNumTF;
    @javafx.fxml.FXML
    private TableView <PortfolioCustodyOfficer>custodyPortfolioTV;
    @javafx.fxml.FXML
    private TableColumn <PortfolioCustodyOfficer, Integer>custodyAccNumCol;

    @javafx.fxml.FXML
    public void initialize() {
        custodyPortfolioIDCol.setCellValueFactory(new PropertyValueFactory<PortfolioCustodyOfficer,String>("portfolioId"));
        custodyAccNumCol.setCellValueFactory(new PropertyValueFactory<PortfolioCustodyOfficer, Integer>("accountNumber"));
        custodyQuantityCol.setCellValueFactory(new PropertyValueFactory<PortfolioCustodyOfficer, Integer>("quantity"));
        custodyTotalValueCol.setCellValueFactory(new PropertyValueFactory<PortfolioCustodyOfficer, Float>("totalValue"));
    }

    @javafx.fxml.FXML
    public void custodyHandleViewForPortfolioOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void custodyHandleSearchForPortfolioOA(ActionEvent actionEvent) {
    }
}