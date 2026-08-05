package RafadinIslam_2111525;

import com.example.ms_3_of_cdbl.HelloApplication;
import com.example.ms_3_of_cdbl.Utilities.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class boAccountManagerController
{
    @javafx.fxml.FXML
    private BorderPane boAccountManagerBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchCustomerByNameOrPlanButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/searchCustomerByPlanOrName.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }

    }

    @javafx.fxml.FXML
    public void deleteCusromerDetailsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/deleteCustomerDetails.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }

    }

    @javafx.fxml.FXML
    public void updateCustomerDetailsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/updateCustomerDetails.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void sortCustomerRecordButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/sortCustomerRecord.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void loadCustomerDataButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/loadCustomerData.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void viewAccountDetailsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/viewBoAccountDetails.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void addNewCustomerButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/addNewCustomer.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void filterCustomerButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/filterCustomer.fxml"));
            boAccountManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/userDashboard.fxml","userDashboard");
    }
}