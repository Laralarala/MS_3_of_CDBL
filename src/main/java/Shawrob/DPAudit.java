package Shawrob;

public class DPAudit {

    private String holderName;
    private int accountNo;
    private float totalHolding;

    public DPAudit(String holderName, int accountNo, float totalHolding) {
        this.holderName = holderName;
        this.accountNo = accountNo;
        this.totalHolding = totalHolding;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
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
        return "DPAudit{" +
                "holderName='" + holderName + '\'' +
                ", accountNo=" + accountNo +
                ", totalHolding=" + totalHolding +
                '}';
    }
}
