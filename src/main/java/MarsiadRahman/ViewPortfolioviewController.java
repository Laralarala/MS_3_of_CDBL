package MarsiadRahman;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class ViewPortfolioviewController {

    @FXML private Label lblStatusMessage;
    @FXML private Button btnBack;
    @FXML private TextField txtBoAccountNo;
    @FXML private TextArea txtAPortfolioDetails;
    @FXML private ComboBox<String> cmbPortfolioOption;
    @FXML private Button btnViewportfolio;
    @FXML private Button btnClear;

    @FXML
    public void initialize() {

        cmbPortfolioOption.getItems().addAll("All Securities", "Stocks", "Bonds");
    }

    @FXML
    public void viewportfolioOA(ActionEvent actionEvent) {
        String boNo = txtBoAccountNo.getText();

        if(boNo.isEmpty()){
            lblStatusMessage.setText("BO Account No dao!");
            return;
        }

        txtAPortfolioDetails.setText("BO No: " + boNo + "\n");
        lblStatusMessage.setText("Portfolio Loaded");
    }

    @FXML
    public void backOA(ActionEvent actionEvent) {
        lblStatusMessage.setText("Back");

    }

    @FXML
    public void clearOA(ActionEvent actionEvent) {
        txtBoAccountNo.clear();
        txtAPortfolioDetails.clear();
        cmbPortfolioOption.setValue(null);
        lblStatusMessage.setText("");
    }
}