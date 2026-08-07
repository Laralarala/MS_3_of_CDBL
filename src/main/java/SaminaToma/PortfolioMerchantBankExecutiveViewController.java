package SaminaToma;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PortfolioMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private TableColumn <PortfolioMerchantBankExecutive, String>portfolioIDColUser7;
    @javafx.fxml.FXML
    private TableColumn <PortfolioMerchantBankExecutive, Float>totalValueColUser7;
    @javafx.fxml.FXML
    private TableColumn <PortfolioMerchantBankExecutive, Integer>quantityColUser7;
    @javafx.fxml.FXML
    private TableView <PortfolioMerchantBankExecutive>portfolioTV;
    @javafx.fxml.FXML
    private TableColumn <PortfolioMerchantBankExecutive, Integer>accNumColUser7;
    @javafx.fxml.FXML
    private TextField accNumTF;

    @javafx.fxml.FXML
    public void initialize() {
        accNumColUser7.setCellValueFactory(new PropertyValueFactory<PortfolioMerchantBankExecutive,Integer>("accountNumber"));
        portfolioIDColUser7.setCellValueFactory(new PropertyValueFactory<PortfolioMerchantBankExecutive,String>("portfolioId"));
        quantityColUser7.setCellValueFactory(new PropertyValueFactory<PortfolioMerchantBankExecutive,Integer>("quantity"));
        totalValueColUser7.setCellValueFactory(new PropertyValueFactory<PortfolioMerchantBankExecutive,Float>("totalValue"));
    }

    @javafx.fxml.FXML
    public void handleSearchForPortfolioOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleViewForPortfolioOA(ActionEvent actionEvent) {
    }
}