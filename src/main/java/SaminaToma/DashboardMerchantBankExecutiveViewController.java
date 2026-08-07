package SaminaToma;

import com.example.ms_3_of_cdbl.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class DashboardMerchantBankExecutiveViewController
{
    @javafx.fxml.FXML
    private BorderPane dashboardMerchantBankBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void portfolioViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Portfolio_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void accountManagementViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Account_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void approveTransactionViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/ApproveTransaction_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void complianceViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Compliance_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void updateRecordsViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Records_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void logOutViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/UserLogin.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void reportViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Report_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void securityMangementViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Security_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void transactionViewOA(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Transaction_MerchantBankExecutiveView.fxml"));
            dashboardMerchantBankBP.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }
}