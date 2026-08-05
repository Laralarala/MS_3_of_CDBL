package RafadinIslam_2111525;

import com.example.ms_3_of_cdbl.HelloApplication;
import com.example.ms_3_of_cdbl.Utilities.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class subscriptionManagerController
{
    @javafx.fxml.FXML
    private BorderPane subscriptionManagerBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterSubscriptionByActiveOrExpiredButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/filterSubscriptionByActiveOrExpired.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void saveSubscriptionDataButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/saveSubscriptionData.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void updateCustomerSubcriptionButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/updateExistingCustomerSubscription.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void deleteOrCancelSubscriptionButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/deleteOrCancelSubscription.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void viewCustomerSubscriptionDetailsButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/viewCustomerSubscriptionDetails.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        SceneSwitcher.switchScene(actionEvent,"/userDashboard.fxml","userDashboard");
    }

    @javafx.fxml.FXML
    public void addNewSubscriptionButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/addNewSubscription.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void showTotalSubscriptionNumberButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/showTotalNumberOfSubscription.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void searchSubscriptionByCustomerNameOrPlane(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/RafadinIslam_2111525/searchForSubscriptionByCustomerNameorPlan.fxml"));
            subscriptionManagerBorderPane.setCenter(fxmlLoader.load());
        }
        catch (Exception e){

        }
    }
}