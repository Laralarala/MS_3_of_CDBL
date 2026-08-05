package Shawrob;

public class SubmitSTR {

    private String securityName;
    private int transactionId , quantity;
    private float price;

    public SubmitSTR(String securityName, int transactionId, int quantity, float price) {
        this.securityName = securityName;
        this.transactionId = transactionId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SubmitSTR{" +
                "securityName='" + securityName + '\'' +
                ", transactionId=" + transactionId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
