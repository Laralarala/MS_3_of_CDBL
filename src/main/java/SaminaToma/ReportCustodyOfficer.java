package SaminaToma;

import java.time.LocalDate;

public class ReportCustodyOfficer {
    private String reportId,reportType;
    private LocalDate reportDate;


    public ReportCustodyOfficer(String reportId, String reportType, LocalDate reportDate) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.reportDate = reportDate;
    }

    public ReportCustodyOfficer() {
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "ReportCustodyOfficer{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}
