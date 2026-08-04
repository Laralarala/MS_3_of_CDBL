package SaminaToma;

public class SecurityMerchantBankExecutive {
    private String securityId,companyName;
    private int quantity;
    private Float price;

    public SecurityMerchantBankExecutive(String securityId, String companyName, int quantity, Float price) {
        this.securityId = securityId;
        this.companyName = companyName;
        this.quantity = quantity;
        this.price = price;
    }

    public SecurityMerchantBankExecutive() {
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SecurityMerchantBankExecutive{" +
                "securityId='" + securityId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
