package Shawrob;

import java.time.LocalDate;

public class BOActivity {
    private LocalDate fromDate , toDate ,tradeDate ;
    private int accountNo , quantity;
    private String securityName , type ;
    private float price;

    public BOActivity(LocalDate fromDate, LocalDate toDate, LocalDate tradeDate, int accountNo, int quantity, String securityName, String type, float price) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.tradeDate = tradeDate;
        this.accountNo = accountNo;
        this.quantity = quantity;
        this.securityName = securityName;
        this.type = type;
        this.price = price;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
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

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
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
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", tradeDate=" + tradeDate +
                ", accountNo=" + accountNo +
                ", quantity=" + quantity +
                ", securityName='" + securityName + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}