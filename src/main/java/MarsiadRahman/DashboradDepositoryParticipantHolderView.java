package MarsiadRahman;

import javafx.event.ActionEvent;

public class DashboradDepositoryParticipantHolderView
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void WithdrawSecurities(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/WithdrawSecuritiesView.fxml","withdrawnSecurities");
    }

    @javafx.fxml.FXML
    public void UpdateProfile(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/UpdateProfile_view.fxml","updateProfile");
    }

    @javafx.fxml.FXML
    public void OpenBoAccount(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/OpenBOAccount_view.fxml","openBOAccount");
    }

    @javafx.fxml.FXML
    public void LoginAccount(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/LoginAccount_view.fxml","loginAccount");
    }

    @javafx.fxml.FXML
    public void GenerateStatement(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/GenerateStatement_view.fxml","generateStatement");
    }

    @javafx.fxml.FXML
    public void Back(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewPortfolio(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/ViewPortfolio_view.fxml","viewPortfolio");
    }

    @javafx.fxml.FXML
    public void DepositSecurities(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/DepositSecurities_View.fxml","depositSecurities");
    }

    @javafx.fxml.FXML
    public void TransferSecurities(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/com/example/ms_3_of_cdbl/MarsiadRahman/TransferSecurities_view.fxml","transferSecurities");
    }
}