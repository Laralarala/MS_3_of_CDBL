package Shawrob;

import com.example.ms_3_of_cdbl.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ComplianceOfficerDashboardController
{
    @javafx.fxml.FXML
    private BorderPane complianceOfficerDashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitSTROnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/submitSTR-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void policyManagementOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/policyManagement-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void freezeAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/freezeAccount-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/UserLogin.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("CDBL");
        nextStage.setScene(nextScene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void unfreezeAccountOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/unfreezeAccount-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void dpAuditOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/dpAudit-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void kycReviewOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/kycReview-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void tradingLimitOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/tradingLimit-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void suspiciousTransactionsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Shawrob/suspiciousTransactions-view.fxml"));
        complianceOfficerDashboardBP.setCenter(fxmlLoader.load());
    }
}