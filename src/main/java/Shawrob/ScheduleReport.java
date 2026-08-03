package Shawrob;

public class ScheduleReport {

    private String frequency , reportTime , recipientEmail;

    public ScheduleReport(String frequency, String reportTime, String recipientEmail) {
        this.frequency = frequency;
        this.reportTime = reportTime;
        this.recipientEmail = recipientEmail;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    @Override
    public String toString() {
        return "ScheduleReport{" +
                "frequency='" + frequency + '\'' +
                ", reportTime='" + reportTime + '\'' +
                ", recipientEmail='" + recipientEmail + '\'' +
                '}';
    }
}
