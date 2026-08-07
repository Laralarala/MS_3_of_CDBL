package RafadinIslam_2111525;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.util.ArrayList;


public class DeleteCustomerDetails
{
    @javafx.fxml.FXML
    private Label messageShowingLabel;
    @javafx.fxml.FXML
    private TableView<Customer> customerDetailsTable;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> boIDTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> accountNameTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,String> genderTableCol;
    @javafx.fxml.FXML
    private TableColumn<Customer,Integer> numberTableCol;

    private ArrayList<Customer> customersList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        accountNameTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("AccountName"));
        genderTableCol.setCellValueFactory(new PropertyValueFactory<Customer,String>("Gender"));
        boIDTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("BoId"));
        numberTableCol.setCellValueFactory(new PropertyValueFactory<Customer,Integer>("Number"));

    }


    @javafx.fxml.FXML
    public void deleteCustomerButtonOnAction(ActionEvent actionEvent) {
        Customer selectedCustomer = customerDetailsTable.getSelectionModel().getSelectedItem();
        if (selectedCustomer == null) return;

        for (Customer c : customersList) {
            if (selectedCustomer.getBoId() == c.getBoId()) {
                customersList.remove(c);
                break;
            }
        }
        customerDetailsTable.getItems().remove(selectedCustomer);


        try {
            FileOutputStream fos = new FileOutputStream("Customer.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Customer c : customersList) {
                oos.writeObject(c);
            }
            oos.close();
            messageShowingLabel.setText("Customer deleted");
        } catch (Exception e) {
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
            customerDetailsTable.getItems().clear();

            while (true) {
                try {
                    Customer c = (Customer) ois.readObject();
                    customersList.add(c);
                    customerDetailsTable.getItems().add(c);
                } catch (EOFException eof) {
                    break;
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }