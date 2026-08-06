package RafadinIslam_2111525;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class ViewBoAccountDetails
{
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> boIdTableCol;
    @javafx.fxml.FXML
    private TableView<Customer> boAccountDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> accountNameTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> genderTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> numberTableCol;

    @javafx.fxml.FXML
    public void initialize() {
        accountNameTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("AccountName"));
        genderTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("Gender"));
        boIdTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("BoId"));
        numberTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("Number"));

    }

    @javafx.fxml.FXML
    public void viewBoAccountDetailsOnActionButton(ActionEvent actionEvent) {
        try {

            File f = new File("Customer.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true){
                boAccountDetailsTableView.getItems().add((Customer) ois.readObject());

            }

        }
        catch (Exception e){
            //
        }

    }
}