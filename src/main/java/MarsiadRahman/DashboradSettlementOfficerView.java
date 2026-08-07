package MarsiadRahman;

import javafx.event.ActionEvent;

public class DashboradSettlementOfficerView
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void MatchTrades(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/MatchTrades_View.fxml","matchTrade");
    }

    @javafx.fxml.FXML
    public void FundSettlement(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/FundSettlement_view.fxml","fundSettlementReport");
    }

    @javafx.fxml.FXML
    public void Back(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MonitorSettlementStatus(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/MonitorSettlementStatus_view.fxml","MonitorSettlementStatus");
    }

    @javafx.fxml.FXML
    public void ComplianceReview(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/ComplianceReview_view.fxml","compilanceReview");
    }

    @javafx.fxml.FXML
    public void ValidateTradeData(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/ValidateTradeData_view.fxml","validateTradeData");
    }

    @javafx.fxml.FXML
    public void HandleFailedSettlement(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/HandleFailedSettlement_view.fxml","handleFailedSettlement");
    }

    @javafx.fxml.FXML
    public void GenerateSettlementReport(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/GenerateSettlementReport_view.fxml","generateSettlementReport");
    }

    @javafx.fxml.FXML
    public void SecuritiesSettlement(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/SecuritiesSettlement_view.fxml","securitiesSettlementReport");
    }
}