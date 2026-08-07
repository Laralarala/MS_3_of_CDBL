package RafadinIslam_2111525;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;

public class UpdateCustomerDetailsController
{
    @javafx.fxml.FXML
    private TableView<Customer> updateCustomerDetailsTableView;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> genderTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> numberTableCol;
    @javafx.fxml.FXML
    private Label messageShowingLabel;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> boIdTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> accountNameTableCol;
    @javafx.fxml.FXML
    private TextField updateNumberTextField;

    private ArrayList<Customer> customersList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        accountNameTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("AccountName"));
        genderTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("Gender"));
        boIdTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("BoId"));
        numberTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("Number"));
    }

    @javafx.fxml.FXML
    public void updateCustomerDetailsButtonOnAction(ActionEvent actionEvent) {
        Customer selectedCustomer = updateCustomerDetailsTableView.getSelectionModel().getSelectedItem();
        if (selectedCustomer == null) {
            messageShowingLabel.setText("Please select a customer first");
            return;
        }

        try {
            int newNumber = Integer.parseInt(updateNumberTextField.getText());
            selectedCustomer.setNumber(newNumber);

            FileOutputStream fos = new FileOutputStream("Customer.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Customer c : customersList) {
                oos.writeObject(c);
            }
            oos.close();

            updateCustomerDetailsTableView.refresh();
            messageShowingLabel.setText("Customer number updated to " + newNumber);
        }
        catch (Exception e) {
            messageShowingLabel.setText("Please enter a valid number");
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void loadCustomerDetailsButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("Customer.bin");
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            customersList.clear();
            updateCustomerDetailsTableView.getItems().clear();

            while (true) {
                try {
                    Customer c = (Customer) ois.readObject();
                    customersList.add(c);
                    updateCustomerDetailsTableView.getItems().add(c);
                } catch (EOFException eof) {
                    break;
                }
            }

            ois.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}