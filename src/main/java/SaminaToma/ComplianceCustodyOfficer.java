package SaminaToma;

public class ComplianceCustodyOfficer {
    private String status;
    private int complianceId,accountNo;

    public ComplianceCustodyOfficer(String status, int complianceId, int accountNo) {
        this.status = status;
        this.complianceId = complianceId;
        this.accountNo = accountNo;
    }

    public ComplianceCustodyOfficer() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getComplianceId() {
        return complianceId;
    }

    public void setComplianceId(int complianceId) {
        this.complianceId = complianceId;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public String toString() {
        return "ComplianceCustodyOfficer{" +
                "status='" + status + '\'' +
                ", complianceId=" + complianceId +
                ", accountNo=" + accountNo +
                '}';
    }
}
