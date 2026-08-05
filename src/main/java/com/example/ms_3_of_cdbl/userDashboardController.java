package com.example.ms_3_of_cdbl;

import com.example.ms_3_of_cdbl.Utilities.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class userDashboardController
{
    @javafx.fxml.FXML
    private Label messageShownLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void compilanceOfficerButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/Shawrob/complianceOfficerDashboard-view.fxml","compilanceOfficer");
    }

    @javafx.fxml.FXML
    public void merchantBankExecutiveButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/SaminaToma/Dashborad_MerchantBankExecutiveView.fxml","merchantBankOfficer");

    }

    @javafx.fxml.FXML
    public void depositoryParticipantsHolderButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/Dashborad_ DepositoryParticipantHolderview.fxml","depositoryParticipants");
    }

    @javafx.fxml.FXML
    public void subscriptionManagerbUTTONoNaCTION(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/RafadinIslam_2111525/subscriptionManager.fxml","SubscriptionManager");

    }

    @javafx.fxml.FXML
    public void reportOfficerButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/Shawrob/reportOfficerDashboard-view.fxml","reportOfficer");

    }

    @javafx.fxml.FXML
    public void settlementOfficerButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/Dashborad_SettlementOfficerview.fxml","settlementOfficer");
    }

    @javafx.fxml.FXML
    public void boAccountManagerButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/RafadinIslam_2111525/boAccountManager.fxml","boaccountManager");

    }

    @javafx.fxml.FXML
    public void custodyOfficerButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/SaminaToma/Dashboard_CustodyOfficerView.fxml","CustodyOfficer");
    }
}