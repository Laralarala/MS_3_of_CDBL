package Shawrob;

public class HoldingsReport {

    private String holderName , status;
    private int accountNo;
    private float totalHolding;

    public HoldingsReport(String holderName, String status, int accountNo, float totalHolding) {
        this.holderName = holderName;
        this.status = status;
        this.accountNo = accountNo;
        this.totalHolding = totalHolding;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getTotalHolding() {
        return totalHolding;
    }

    public void setTotalHolding(float totalHolding) {
        this.totalHolding = totalHolding;
    }

    @Override
    public String toString() {
        return "HoldingsReport{" +
                "holderName='" + holderName + '\'' +
                ", status='" + status + '\'' +
                ", accountNo=" + accountNo +
                ", totalHolding=" + totalHolding +
                '}';
    }
}
