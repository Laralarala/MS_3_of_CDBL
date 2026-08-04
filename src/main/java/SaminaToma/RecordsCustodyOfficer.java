package SaminaToma;

import java.time.LocalDate;

public class RecordsCustodyOfficer {
    private String clientId,clientName,email;
    private int accountNumber;
    private LocalDate dateOfBirth;

    public RecordsCustodyOfficer(String clientId, String clientName, String email, int accountNumber, LocalDate dateOfBirth) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.email = email;
        this.accountNumber = accountNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public RecordsCustodyOfficer() {
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "RecordsCustodyOfficer{" +
                "clientId='" + clientId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber=" + accountNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
