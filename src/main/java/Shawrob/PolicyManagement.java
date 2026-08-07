package Shawrob;

import java.time.LocalDate;

public class PolicyManagement {

    private String ruleName;
    private LocalDate effectiveDate;
    private float threshold;

    public PolicyManagement(String ruleName, LocalDate effectiveDate, float threshold) {
        this.ruleName = ruleName;
        this.effectiveDate = effectiveDate;
        this.threshold = threshold;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

    @Override
    public String toString() {
        return "PolicyManagement{" +
                "ruleName='" + ruleName + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", threshold=" + threshold +
                '}';
    }
}
