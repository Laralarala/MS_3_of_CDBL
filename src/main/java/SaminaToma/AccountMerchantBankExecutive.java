package SaminaToma;

public class AccountMerchantBankExecutive {
    private String accountName,holderName,status;
    private int accountId;
    private Float balance;

    public AccountMerchantBankExecutive(String accountName, String holderName, String status, int accountId, Float balance) {
        this.accountName = accountName;
        this.holderName = holderName;
        this.status = status;
        this.accountId = accountId;
        this.balance = balance;
    }

    public AccountMerchantBankExecutive() {
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountMerchantBankExecutive{" +
                "accountName='" + accountName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", status='" + status + '\'' +
                ", accountId=" + accountId +
                ", balance=" + balance +
                '}';
    }
}
