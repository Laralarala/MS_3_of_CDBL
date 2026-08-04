package SaminaToma;

import com.example.ms_3_of_cdbl.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class DashboradCustodyOfficerViewController
{
    @javafx.fxml.FXML
    private BorderPane dashBoardCustodyOfficerBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void custodyTransactionViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Transaction_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyLogOutViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Dashboard_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyReportViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Report_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyManageAccountViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Account_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyUpdateRecordViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Records_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyPortfolioViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Portfolio_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyReconcileViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ReconcileHoldings_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodySecurityViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Security_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void custodyComplianceViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Compliance_CustodyOfficerView.fxml"));
            dashBoardCustodyOfficerBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }
}