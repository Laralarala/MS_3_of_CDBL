package Shawrob;

import java.time.LocalDate;

public class DailySummary {

    private LocalDate generateDate;
    private int reportID;
    private String reportType , status;

    public DailySummary(LocalDate generateDate, int reportID, String reportType, String status) {
        this.generateDate = generateDate;
        this.reportID = reportID;
        this.reportType = reportType;
        this.status = "Active";
    }

    public LocalDate getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(LocalDate generateDate) {
        this.generateDate = generateDate;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DailySummary{" +
                "generateDate=" + generateDate +
                ", reportID=" + reportID +
                ", reportType='" + reportType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}