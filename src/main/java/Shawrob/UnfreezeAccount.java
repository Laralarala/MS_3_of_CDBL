package Shawrob;

public class UnfreezeAccount {

    private String holderName , status;
    private int accountNo;

    public UnfreezeAccount(String holderName, String status, int accountNo) {
        this.holderName = holderName;
        this.status = status;
        this.accountNo = accountNo;
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

    @Override
    public String toString() {
        return "UnfreezeAccount{" +
                "holderName='" + holderName + '\'' +
                ", status='" + status + '\'' +
                ", accountNo=" + accountNo +
                '}';
    }
}
