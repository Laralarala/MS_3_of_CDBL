package com.example.ms_3_of_cdbl;

import com.example.ms_3_of_cdbl.Utilities.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class userDashboardController
{

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void CustodyOfficerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/SaminaToma/Dashboard_CustodyOfficerView.fxml","CustodyOfficer");
    }

    @javafx.fxml.FXML
    public void ReportOfficerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/Shawrob/reportOfficerDashboard-view.fxml","reportOfficer");
    }

    @javafx.fxml.FXML
    public void SubscriptionManagerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/RafadinIslam_2111525/subscriptionManager.fxml","SubscriptionManager");
    }

    @javafx.fxml.FXML
    public void BoAccountManagerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/RafadinIslam_2111525/boAccountManager.fxml","boaccountManager");
    }

    @javafx.fxml.FXML
    public void MerchantBankExecutiveButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/SaminaToma/Dashborad_MerchantBankExecutiveView.fxml","merchantBankOfficer");
    }

    @javafx.fxml.FXML
    public void SettlementOfficerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/Dashborad_SettlementOfficerview.fxml","settlementOfficer");
    }

    @javafx.fxml.FXML
    public void DepositoryParticipantHolderButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/Dashborad_ DepositoryParticipantHolderview.fxml","depositoryParticipants");
    }

    @javafx.fxml.FXML
    public void CompilanceOfficerButton(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/Shawrob/complianceOfficerDashboard-view.fxml","compilanceOfficer");
    }

}