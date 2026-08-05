package Shawrob;

import java.time.LocalDate;

public class BOActivity {
    private LocalDate tradeDate ;
    private int accountNo , quantity;
    private String type ;
    private float price;


    public BOActivity(LocalDate tradeDate, int accountNo, int quantity, String type, float price) {
        this.tradeDate = tradeDate;
        this.accountNo = accountNo;
        this.quantity = quantity;
        this.type = type;
        this.price = price;
    }


    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "BOActivity{" +
                "tradeDate=" + tradeDate +
                ", accountNo=" + accountNo +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}