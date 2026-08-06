package RafadinIslam_2111525;

import java.io.Serializable;

public class Customer implements Serializable {
    private int BoId,Number;
    private String AccountName,Gender;

    public Customer(int boId, int number, String accountName, String gender) {
        BoId = boId;
        Number = number;
        AccountName = accountName;
        Gender = gender;
    }

    public Customer() {
    }

    public int getBoId() {
        return BoId;
    }

    public void setBoId(int boId) {
        BoId = boId;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "BoId=" + BoId +
                ", Number=" + Number +
                ", AccountName='" + AccountName + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
