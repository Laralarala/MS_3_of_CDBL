package Shawrob;

import java.time.LocalDate;

public class CorporateAction {

    private LocalDate generateDate;
    private int reportID;
    private String reportType , fileFormat;

    public CorporateAction(LocalDate generateDate, int reportID, String reportType, String fileFormat) {
        this.generateDate = generateDate;
        this.reportID = reportID;
        this.reportType = reportType;
        this.fileFormat = "PDF";
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

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "CorporateAction{" +
                "generateDate=" + generateDate +
                ", reportID=" + reportID +
                ", reportType='" + reportType + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}