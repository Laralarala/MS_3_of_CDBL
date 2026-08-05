package Shawrob;

import java.time.LocalDate;

public class SuspiciousTransactions {

    private String type;
    private int transactionId , quantity;
    private LocalDate tradeDate;

    public SuspiciousTransactions(String type, int transactionId, int quantity, LocalDate tradeDate) {
        this.type = "PDF";
        this.transactionId = transactionId;
        this.quantity = quantity;
        this.tradeDate = tradeDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String toString() {
        return "SuspiciousTransactions{" +
                "type='" + type + '\'' +
                ", transactionId=" + transactionId +
                ", quantity=" + quantity +
                ", tradeDate=" + tradeDate +
                '}';
    }
}
