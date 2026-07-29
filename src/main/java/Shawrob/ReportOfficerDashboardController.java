package Shawrob;

import com.example.ms_3_of_cdbl.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReportOfficerDashboardController
{
    @javafx.fxml.FXML
    private BorderPane reportOfficerDashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void auditTrailOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("auditTrail-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void dormantAccountsOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dormantAccounts-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void settlementReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("settlementReport-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void corporateActionOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("corporateAction-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("User.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("CDBL");
        nextStage.setScene(nextScene);
        nextStage.show();
    }

    @javafx.fxml.FXML
    public void holdingsReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("holdingsReport-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void dailySummaryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dailySummary-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void scheduleReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scheduleReport-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void boActivityOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("boActivity-view.fxml"));
        reportOfficerDashboardBP.setCenter(fxmlLoader.load());
    }
}