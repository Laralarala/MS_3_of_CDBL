package com.example.ms_3_of_cdbl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/SaminaToma/Dashboard_MerchantBankExecutiveView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Merchant Bank Executive Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}