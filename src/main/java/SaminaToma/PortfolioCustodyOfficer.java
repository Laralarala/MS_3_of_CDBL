package SaminaToma;

public class PortfolioCustodyOfficer {
    private String portfolioId;
    private int accountNumber,quantity;
    private Float totalValue;

    public PortfolioCustodyOfficer(String portfolioId, int accountNumber, int quantity, Float totalValue) {
        this.portfolioId = portfolioId;
        this.accountNumber = accountNumber;
        this.quantity = quantity;
        this.totalValue = totalValue;
    }

    public PortfolioCustodyOfficer() {
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Float totalValue) {
        this.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return "PortfolioCustodyOfficer{" +
                "portfolioId='" + portfolioId + '\'' +
                ", accountNumber=" + accountNumber +
                ", quantity=" + quantity +
                ", totalValue=" + totalValue +
                '}';
    }
}
