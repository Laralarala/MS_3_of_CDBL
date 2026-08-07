package Shawrob;


public class DormantAccounts {


    private int accountNo;
    private String holderName , lastTransaction;

    public DormantAccounts(int accountNo, String holderName, String lastTransaction) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.lastTransaction = lastTransaction;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    @Override
    public String toString() {
        return "DormantAccounts{" +
                "accountNo=" + accountNo +
                ", holderName='" + holderName + '\'' +
                ", lastTransaction='" + lastTransaction + '\'' +
                '}';
    }
}
