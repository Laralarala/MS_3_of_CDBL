package SaminaToma;

import java.time.LocalDate;

public class TransactionCustodyOfficer {
    private String transactionId,transactionType;
    private int accountNo,quantity;
    private Float amount;
    private LocalDate transactionDate;

    public TransactionCustodyOfficer(String transactionId, String transactionType, int accountNo, int quantity, Float amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.accountNo = accountNo;
        this.quantity = quantity;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public TransactionCustodyOfficer() {
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "TransactionCustodyOfficer{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", accountNo=" + accountNo +
                ", quantity=" + quantity +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
