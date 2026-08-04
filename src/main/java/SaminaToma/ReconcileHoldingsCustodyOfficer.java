package SaminaToma;

public class ReconcileHoldingsCustodyOfficer {
    private String securityId,securityName,holdingId,status;
    private int accountNumber,quantity;

    public ReconcileHoldingsCustodyOfficer(String securityId, String securityName, String holdingId, String status, int accountNumber, int quantity) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.holdingId = holdingId;
        this.status = status;
        this.accountNumber = accountNumber;
        this.quantity = quantity;
    }

    public ReconcileHoldingsCustodyOfficer() {
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(String holdingId) {
        this.holdingId = holdingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "ReconcileHoldingsCustodyOfficer{" +
                "securityId='" + securityId + '\'' +
                ", securityName='" + securityName + '\'' +
                ", holdingId='" + holdingId + '\'' +
                ", status='" + status + '\'' +
                ", accountNumber=" + accountNumber +
                ", quantity=" + quantity +
                '}';
    }
}
