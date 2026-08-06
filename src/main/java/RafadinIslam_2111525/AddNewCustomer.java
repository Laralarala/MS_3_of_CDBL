package RafadinIslam_2111525;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddNewCustomer
{
    @javafx.fxml.FXML
    private TextField numberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> genderComboBox;
    @javafx.fxml.FXML
    private TextField accountNameTextField;
    @javafx.fxml.FXML
    private TextField boIdTextField;

    ArrayList<Customer> customersList;

    @javafx.fxml.FXML
    public void initialize() {
        customersList = new ArrayList<Customer>();
        genderComboBox.getItems().addAll("Male","Female");
    }

    @javafx.fxml.FXML
    public void addNewCustomerOnActionButton(ActionEvent actionEvent) {
        //int boId, int number, String accountName, String gender
        Customer c = new Customer(Integer.parseInt(boIdTextField.getText()),
                Integer.parseInt(numberTextField.getText()),
                accountNameTextField.getText(),
                genderComboBox.getValue());

        customersList.add(c);
        boIdTextField.clear();
        accountNameTextField.clear();
        genderComboBox.cancelEdit();
        numberTextField.clear();
    }

    @javafx.fxml.FXML
    public void addNewCustomerBinFileOnActionButton(ActionEvent actionEvent) {
        try {
            File f = new File("Customer.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (Customer c : customersList){
                oos.writeObject(c);
            }
            oos.close();


        }
        catch (Exception e){
            //
        }

    }
}