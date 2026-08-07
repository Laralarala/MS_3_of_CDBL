package MarsiadRahman;

import java.time.LocalDate;

public class ClientService {
    private String ComplianceType, AuditCriteria, ComplianceReport, ReportDetails, ReportPeriod, BoAccountNo, StatementOutputTTransactionID, FailureReason, ActionTaken, HolderId, HolderName, Nid, Phone, email, Address,SecurityID, TradeId, TradeStatus;
    private LocalDate auditDate, startDate, endDate, birthdate;
    private int quantity;

    public ClientService(String complianceType, String auditCriteria, String complianceReport, String reportDetails, String reportPeriod, String boAccountNo, String statementOutputTTransactionID, String failureReason, String actionTaken, String holderId, String holderName, String nid, String phone, String email, String address, String securityID, String tradeId, String tradeStatus, LocalDate auditDate, LocalDate startDate, LocalDate endDate, LocalDate birthdate, int quantity) {
        ComplianceType = complianceType;
        AuditCriteria = auditCriteria;
        ComplianceReport = complianceReport;
        ReportDetails = reportDetails;
        ReportPeriod = reportPeriod;
        BoAccountNo = boAccountNo;
        StatementOutputTTransactionID = statementOutputTTransactionID;
        FailureReason = failureReason;
        ActionTaken = actionTaken;
        HolderId = holderId;
        HolderName = holderName;
        Nid = nid;
        Phone = phone;
        this.email = email;
        Address = address;
        SecurityID = securityID;
        TradeId = tradeId;
        TradeStatus = tradeStatus;
        this.auditDate = auditDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.birthdate = birthdate;
        this.quantity = quantity;
    }

    public String getComplianceType() {
        return ComplianceType;
    }

    public String getAuditCriteria() {
        return AuditCriteria;
    }

    public String getComplianceReport() {
        return ComplianceReport;
    }

    public String getReportPeriod() {
        return ReportPeriod;
    }

    public String getReportDetails() {
        return ReportDetails;
    }

    public String getBoAccountNo() {
        return BoAccountNo;
    }

    public String getStatementOutputTTransactionID() {
        return StatementOutputTTransactionID;
    }

    public String getFailureReason() {
        return FailureReason;
    }

    public String getActionTaken() {
        return ActionTaken;
    }

    public String getHolderId() {
        return HolderId;
    }

    public String getHolderName() {
        return HolderName;
    }

    public String getNid() {
        return Nid;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return Address;
    }

    public String getSecurityID() {
        return SecurityID;
    }

    public String getTradeId() {
        return TradeId;
    }

    public String getTradeStatus() {
        return TradeStatus;
    }

    public LocalDate getAuditDate() {
        return auditDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setComplianceType(String complianceType) {
        ComplianceType = complianceType;
    }

    public void setAuditCriteria(String auditCriteria) {
        AuditCriteria = auditCriteria;
    }

    public void setComplianceReport(String complianceReport) {
        ComplianceReport = complianceReport;
    }

    public void setReportDetails(String reportDetails) {
        ReportDetails = reportDetails;
    }

    public void setReportPeriod(String reportPeriod) {
        ReportPeriod = reportPeriod;
    }

    public void setBoAccountNo(String boAccountNo) {
        BoAccountNo = boAccountNo;
    }

    public void setStatementOutputTTransactionID(String statementOutputTTransactionID) {
        StatementOutputTTransactionID = statementOutputTTransactionID;
    }

    public void setFailureReason(String failureReason) {
        FailureReason = failureReason;
    }

    public void setHolderId(String holderId) {
        HolderId = holderId;
    }

    public void setActionTaken(String actionTaken) {
        ActionTaken = actionTaken;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public void setNid(String nid) {
        Nid = nid;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSecurityID(String securityID) {
        SecurityID = securityID;
    }

    public void setTradeId(String tradeId) {
        TradeId = tradeId;
    }

    public void setTradeStatus(String tradeStatus) {
        TradeStatus = tradeStatus;
    }

    public void setAuditDate(LocalDate auditDate) {
        this.auditDate = auditDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ClientService{" +
                "ComplianceType='" + ComplianceType + '\'' +
                ", AuditCriteria='" + AuditCriteria + '\'' +
                ", ComplianceReport='" + ComplianceReport + '\'' +
                ", ReportDetails='" + ReportDetails + '\'' +
                ", ReportPeriod='" + ReportPeriod + '\'' +
                ", BoAccountNo='" + BoAccountNo + '\'' +
                ", StatementOutputTTransactionID='" + StatementOutputTTransactionID + '\'' +
                ", FailureReason='" + FailureReason + '\'' +
                ", ActionTaken='" + ActionTaken + '\'' +
                ", HolderId='" + HolderId + '\'' +
                ", HolderName='" + HolderName + '\'' +
                ", Nid='" + Nid + '\'' +
                ", Phone='" + Phone + '\'' +
                ", email='" + email + '\'' +
                ", Address='" + Address + '\'' +
                ", SecurityID='" + SecurityID + '\'' +
                ", TradeId='" + TradeId + '\'' +
                ", TradeStatus='" + TradeStatus + '\'' +
                ", auditDate=" + auditDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", birthdate=" + birthdate +
                ", quantity=" + quantity +
                '}';
    }
}
