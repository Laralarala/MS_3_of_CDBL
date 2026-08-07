package SaminaToma;

public class SecurityCustodyOfficer {
    private String securityId,companyName;
    private int quantity;
    private Float price;

    public SecurityCustodyOfficer(String securityId, String companyName, Float price, int quantity) {
        this.securityId = securityId;
        this.companyName = companyName;
        this.price = price;
        this.quantity = quantity;
    }

    public SecurityCustodyOfficer() {
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
        return "SecurityCustodyOfficer{" +
                "securityId='" + securityId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
