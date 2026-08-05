package Shawrob;

import java.time.LocalDate;

public class AuditTrail {
    private LocalDate generateDate;
    private int reportId;
    private String reportType , fileFormat;

    public AuditTrail(LocalDate generateDate, int reportId, String reportType, String fileFormat) {
        this.generateDate = generateDate;
        this.reportId = reportId;
        this.reportType = reportType;
        this.fileFormat = fileFormat;
    }

    public LocalDate getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(LocalDate generateDate) {
        this.generateDate = generateDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "AuditTrail{" +
                "generateDate=" + generateDate +
                ", reportId=" + reportId +
                ", reportType='" + reportType + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}