package Shawrob;

import java.time.LocalDate;

public class SettlementReport {

    private String reportType , fileFormat;
    private int reportId;
    private LocalDate generateDate;

    public SettlementReport(String reportType, String fileFormat, int reportId, LocalDate generateDate) {
        this.reportType = reportType;
        this.fileFormat = fileFormat;
        this.reportId = reportId;
        this.generateDate = generateDate;
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

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public LocalDate getGenerateDate() {
        return generateDate;
    }

    public void setGenerateDate(LocalDate generateDate) {
        this.generateDate = generateDate;
    }

    @Override
    public String toString() {
        return "SettlementReport{" +
                "reportType='" + reportType + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                ", reportId=" + reportId +
                ", generateDate=" + generateDate +
                '}';
    }
}
